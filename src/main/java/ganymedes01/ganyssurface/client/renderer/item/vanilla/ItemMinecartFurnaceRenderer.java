package ganymedes01.ganyssurface.client.renderer.item.vanilla;

import ganymedes01.ganyssurface.GlStateManager;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.init.Blocks;
import cpw.mods.fml.client.FMLClientHandler;

/**
 * Gany's Surface
 *
 * @author ganymedes01
 *
 */

public class ItemMinecartFurnaceRenderer extends ItemMinecartRenderer {

	@Override
	protected void renderBlock(RenderBlocks renderer) {
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(TextureMap.locationBlocksTexture);

		GlStateManager.pushMatrix();
		GlStateManager.scale(0.75 * 0.75, 0.75 * 0.75, 0.75 * 0.75);
		GlStateManager.rotate(270, 0, 1, 0);
		GlStateManager.translate(0.0F, 6 / 16.0F, 0.0F);
		renderer.renderBlockAsItem(Blocks.furnace, 0, 1);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.popMatrix();
	}
}