package com.pam.pamhc2trees.events.harvest;

import java.util.List;

import com.pam.pamhc2trees.blocks.BlockPamFruit;
import com.pam.pamhc2trees.blocks.BlockPamLogFruit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class FruitHarvest {

	/*private static final Method seedDrops;

	static {
		seedDrops = ObfuscationReflectionHelper.findMethod(CropsBlock.class, "getBaseSeedId");
	}

	private Item getCropSeed(Block block) {
		try {
			return (Item) seedDrops.invoke(block);
		}

		catch (Exception e) {
			Pamhc2trees.LOGGER.error("Where the heck is the seed", e);
		}

		return null;
	}*/

	@SubscribeEvent
	public void onCropHarvest(RightClickBlock event) {
		if (event.getPlayer().getMainHandItem().getItem() != Items.BONE_MEAL) {

			BlockState state = event.getWorld().getBlockState(event.getPos());
			Block block = state.getBlock();

			if (block instanceof BlockPamFruit || block instanceof BlockPamLogFruit) {
				if (!event.getPlayer().getMainHandItem().isEmpty())
					event.setCanceled(true);

				// Really need to move isMaxAge to an interface or something.
				if ((block instanceof BlockPamFruit && ((BlockPamFruit) block).isMaxAge(state)) || (block instanceof BlockPamLogFruit && ((BlockPamLogFruit) block).isMaxAge(state))) {
					if (!event.getWorld().isClientSide) {
						List<ItemStack> drops = Block.getDrops(event.getWorld().getBlockState(event.getPos()),
								(ServerWorld) event.getWorld(), event.getPos(),
								event.getWorld().getBlockEntity(event.getPos()));

						for (int i = 0; i < drops.size(); i++) {
							//if (drops.get(i).getItem() != getCropSeed(block))
							event.getWorld()
							.addFreshEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
									event.getPos().getY(), event.getPos().getZ(),
									drops.get(i)));
						}
					}

					event.getPlayer().causeFoodExhaustion(.05F);
					event.getWorld().playSound((PlayerEntity) null, event.getPos(), SoundEvents.CROP_BREAK,
							SoundCategory.BLOCKS, 1.0F, 0.8F + event.getWorld().random.nextFloat() * 0.4F);
					event.getWorld().setBlock(event.getPos(), block.defaultBlockState(), 2);
				}

				event.getPlayer().swing(Hand.MAIN_HAND);
			}
		}
	}
}


