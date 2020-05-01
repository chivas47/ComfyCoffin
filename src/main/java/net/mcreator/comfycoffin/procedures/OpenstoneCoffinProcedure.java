package net.mcreator.comfycoffin.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.state.IProperty;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.comfycoffin.block.CoffinopenBlock;
import net.mcreator.comfycoffin.block.CoffinBlock;
import net.mcreator.comfycoffin.block.Coffin3_openBlock;
import net.mcreator.comfycoffin.block.Coffin3Block;
import net.mcreator.comfycoffin.block.Coffin2_openBlock;
import net.mcreator.comfycoffin.block.Coffin2Block;
import net.mcreator.comfycoffin.block.Coffin1_openBlock;
import net.mcreator.comfycoffin.block.Coffin1Block;
import net.mcreator.comfycoffin.block.Coffin0_openBlock;
import net.mcreator.comfycoffin.block.Coffin0Block;
import net.mcreator.comfycoffin.ComfyCoffinElements;

import java.util.Map;

@ComfyCoffinElements.ModElement.Tag
public class OpenstoneCoffinProcedure extends ComfyCoffinElements.ModElement {
	public OpenstoneCoffinProcedure(ComfyCoffinElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OpenstoneCoffin!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OpenstoneCoffin!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OpenstoneCoffin!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OpenstoneCoffin!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CoffinBlock.block.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = CoffinopenBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_bs.has(_property))
						_bs = _bs.with(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
			world.playSound((PlayerEntity) null, x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chest.open")),
					SoundCategory.NEUTRAL, (float) 1, (float) 0);
		} else {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CoffinopenBlock.block.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = CoffinBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
				world.playSound((PlayerEntity) null, x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chest.close")),
						SoundCategory.NEUTRAL, (float) 1, (float) 0);
			} else {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coffin0Block.block.getDefaultState().getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = Coffin0_openBlock.block.getDefaultState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
							if (_bs.has(_property))
								_bs = _bs.with(_property, (Comparable) entry.getValue());
						}
						world.setBlockState(_bp, _bs, 3);
					}
					world.playSound((PlayerEntity) null, x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chest.open")),
							SoundCategory.NEUTRAL, (float) 1, (float) 0);
				} else {
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coffin0_openBlock.block.getDefaultState()
							.getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Coffin0Block.block.getDefaultState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_bs.has(_property))
									_bs = _bs.with(_property, (Comparable) entry.getValue());
							}
							world.setBlockState(_bp, _bs, 3);
						}
						world.playSound((PlayerEntity) null, x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chest.close")),
								SoundCategory.NEUTRAL, (float) 1, (float) 0);
					} else {
						if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coffin1Block.block.getDefaultState()
								.getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = Coffin1_openBlock.block.getDefaultState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
									if (_bs.has(_property))
										_bs = _bs.with(_property, (Comparable) entry.getValue());
								}
								world.setBlockState(_bp, _bs, 3);
							}
							world.playSound((PlayerEntity) null, x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chest.open")),
									SoundCategory.NEUTRAL, (float) 1, (float) 0);
						} else {
							if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coffin1_openBlock.block
									.getDefaultState().getBlock())) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = Coffin1Block.block.getDefaultState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
										if (_bs.has(_property))
											_bs = _bs.with(_property, (Comparable) entry.getValue());
									}
									world.setBlockState(_bp, _bs, 3);
								}
								world.playSound((PlayerEntity) null, x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("block.chest.close")), SoundCategory.NEUTRAL, (float) 1, (float) 0);
							} else {
								if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coffin2Block.block.getDefaultState()
										.getBlock())) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = Coffin2_openBlock.block.getDefaultState();
										BlockState _bso = world.getBlockState(_bp);
										for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
											IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
											if (_bs.has(_property))
												_bs = _bs.with(_property, (Comparable) entry.getValue());
										}
										world.setBlockState(_bp, _bs, 3);
									}
									world.playSound((PlayerEntity) null, x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("block.chest.open")), SoundCategory.NEUTRAL, (float) 1, (float) 0);
								} else {
									if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coffin2_openBlock.block
											.getDefaultState().getBlock())) {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = Coffin2Block.block.getDefaultState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
												if (_bs.has(_property))
													_bs = _bs.with(_property, (Comparable) entry.getValue());
											}
											world.setBlockState(_bp, _bs, 3);
										}
										world.playSound((PlayerEntity) null, x, y, z,
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("block.chest.close")),
												SoundCategory.NEUTRAL, (float) 1, (float) 0);
									} else {
										if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coffin3Block.block
												.getDefaultState().getBlock())) {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = Coffin3_openBlock.block.getDefaultState();
												BlockState _bso = world.getBlockState(_bp);
												for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
													IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
													if (_bs.has(_property))
														_bs = _bs.with(_property, (Comparable) entry.getValue());
												}
												world.setBlockState(_bp, _bs, 3);
											}
											world.playSound((PlayerEntity) null, x, y, z,
													(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
															.getValue(new ResourceLocation("block.chest.open")),
													SoundCategory.NEUTRAL, (float) 1, (float) 0);
										} else {
											if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coffin3_openBlock.block
													.getDefaultState().getBlock())) {
												{
													BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
													BlockState _bs = Coffin3Block.block.getDefaultState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														IProperty _property = _bs.getBlock().getStateContainer()
																.getProperty(entry.getKey().getName());
														if (_bs.has(_property))
															_bs = _bs.with(_property, (Comparable) entry.getValue());
													}
													world.setBlockState(_bp, _bs, 3);
												}
												world.playSound((PlayerEntity) null, x, y, z,
														(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																.getValue(new ResourceLocation("block.chest.open")),
														SoundCategory.NEUTRAL, (float) 1, (float) 0);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
