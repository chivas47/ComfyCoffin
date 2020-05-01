package net.mcreator.comfycoffin.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.comfycoffin.item.Item_coffin3Item;
import net.mcreator.comfycoffin.item.Item_coffin2Item;
import net.mcreator.comfycoffin.item.Item_coffin1Item;
import net.mcreator.comfycoffin.item.Item_coffin0Item;
import net.mcreator.comfycoffin.item.CoffinstoneItem;
import net.mcreator.comfycoffin.block.CoffinopenBlock;
import net.mcreator.comfycoffin.block.CoffinBlock;
import net.mcreator.comfycoffin.block.Coffin3Block;
import net.mcreator.comfycoffin.block.Coffin2Block;
import net.mcreator.comfycoffin.block.Coffin1Block;
import net.mcreator.comfycoffin.block.Coffin0Block;
import net.mcreator.comfycoffin.ComfyCoffinElements;

@ComfyCoffinElements.ModElement.Tag
public class PlacecoffinProcedure extends ComfyCoffinElements.ModElement {
	public PlacecoffinProcedure(ComfyCoffinElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Placecoffin!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Placecoffin!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Placecoffin!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Placecoffin!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Placecoffin!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Item_coffin0Item.block, (int) (1)).getItem())
				|| ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(CoffinstoneItem.block, (int) (1)).getItem())
						|| ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Item_coffin1Item.block, (int) (1)).getItem())
								|| ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(Item_coffin2Item.block, (int) (1)).getItem())
										|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getItem() == new ItemStack(Item_coffin3Item.block, (int) (1)).getItem())))))) {
			if (((world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z)))
					&& ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CoffinBlock.block.getDefaultState()
							.getBlock()))
							&& ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CoffinopenBlock.block
									.getDefaultState().getBlock()))
									&& ((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CoffinBlock.block
											.getDefaultState().getBlock()))
											&& ((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
													.getBlock() == CoffinopenBlock.block.getDefaultState().getBlock()))
													&& (world.isAirBlock(new BlockPos((int) x, (int) (y + 2), (int) z))))))))) {
				if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(CoffinstoneItem.block, (int) (1)).getItem())) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), CoffinBlock.block.getDefaultState(), 3);
					world.playSound((PlayerEntity) null, x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 0);
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).inventory
								.clearMatchingItems(p -> new ItemStack(CoffinstoneItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
				} else {
					if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Item_coffin0Item.block, (int) (1)).getItem())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Coffin0Block.block.getDefaultState(), 3);
						world.playSound((PlayerEntity) null, x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")),
								SoundCategory.NEUTRAL, (float) 1, (float) 0);
						if (entity instanceof PlayerEntity)
							((PlayerEntity) entity).inventory
									.clearMatchingItems(p -> new ItemStack(Item_coffin0Item.block, (int) (1)).getItem() == p.getItem(), (int) 1);
					} else {
						if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Item_coffin1Item.block, (int) (1)).getItem())) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Coffin1Block.block.getDefaultState(), 3);
							world.playSound((PlayerEntity) null, x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")),
									SoundCategory.NEUTRAL, (float) 1, (float) 0);
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory
										.clearMatchingItems(p -> new ItemStack(Item_coffin1Item.block, (int) (1)).getItem() == p.getItem(), (int) 1);
						} else {
							if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getItem() == new ItemStack(Item_coffin2Item.block, (int) (1)).getItem())) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Coffin2Block.block.getDefaultState(), 3);
								world.playSound((PlayerEntity) null, x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("block.stone.place")), SoundCategory.NEUTRAL, (float) 1, (float) 0);
								if (entity instanceof PlayerEntity)
									((PlayerEntity) entity).inventory.clearMatchingItems(
											p -> new ItemStack(Item_coffin2Item.block, (int) (1)).getItem() == p.getItem(), (int) 1);
							} else {
								if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(Item_coffin3Item.block, (int) (1)).getItem())) {
									world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Coffin3Block.block.getDefaultState(), 3);
									world.playSound((PlayerEntity) null, x, y, z,
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("block.stone.place")),
											SoundCategory.NEUTRAL, (float) 1, (float) 0);
									if (entity instanceof PlayerEntity)
										((PlayerEntity) entity).inventory.clearMatchingItems(
												p -> new ItemStack(Item_coffin3Item.block, (int) (1)).getItem() == p.getItem(), (int) 1);
								}
							}
						}
					}
				}
			}
		}
	}
}
