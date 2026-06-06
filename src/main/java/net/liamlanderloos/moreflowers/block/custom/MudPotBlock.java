package net.liamlanderloos.moreflowers.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MudPotBlock extends Block {
    public static final IntegerProperty POWER = BlockStateProperties.POWER;
    private static final VoxelShape SHAPE = Block.box(5, 0, 5, 11, 6, 11);

    // User-defined variables for pulse timing
    private static final int MIN_PULSE_DELAY_TICKS = 100; // Minimum delay between pulses (5 seconds)
    private static final int MAX_PULSE_DELAY_TICKS = 200; // Maximum delay between pulses (10 seconds)
    private static final int PULSE_DURATION_TICKS = 1; // How long the redstone pulse lasts (1 tick)

    public MudPotBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(POWER, 0)); // Default to off
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }

    @Override
    public boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    protected int getSignal(BlockState blockState, BlockGetter blockAccess, BlockPos pos, Direction side) {
        return blockState.getValue(POWER);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!level.isClientSide) {
            // Schedule the first pulse after a random delay
            scheduleNextPulse(level, pos, level.random);
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (state.getValue(POWER) > 0) {
            // If power is currently on, turn it off and schedule the next pulse delay
            level.setBlock(pos, state.setValue(POWER, 0), 3);
            scheduleNextPulse(level, pos, random);
        } else {
            // If power is currently off, turn it on (start pulse)
            level.setBlock(pos, state.setValue(POWER, 1), 3); // Signal strength 1
            // Schedule to turn off the pulse after PULSE_DURATION_TICKS
            level.scheduleTick(pos, this, PULSE_DURATION_TICKS);
        }
    }

    /**
     * Schedules the next redstone pulse for this block after a random delay.
     */
    private void scheduleNextPulse(Level level, BlockPos pos, RandomSource random) {
        // Calculate a random delay between MIN_PULSE_DELAY_TICKS and MAX_PULSE_DELAY_TICKS
        int delay = MIN_PULSE_DELAY_TICKS + random.nextInt(MAX_PULSE_DELAY_TICKS - MIN_PULSE_DELAY_TICKS + 1);
        level.scheduleTick(pos, this, delay);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(POWER);
    }
}
