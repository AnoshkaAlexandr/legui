package org.liquidengine.legui.system.renderer.nvg.component;

import static org.liquidengine.legui.system.renderer.ImageRenderer.C_RADIUS;
import static org.liquidengine.legui.system.renderer.nvg.NvgRenderer.renderImage;
import static org.liquidengine.legui.system.renderer.nvg.util.NvgRenderUtils.createScissor;
import static org.liquidengine.legui.system.renderer.nvg.util.NvgRenderUtils.resetScissor;

import java.util.HashMap;
import org.joml.Vector2f;
import org.liquidengine.legui.component.ImageView;
import org.liquidengine.legui.system.context.Context;

/**
 * Created by ShchAlexander on 11.02.2017.
 */
public class NvgImageViewRenderer extends NvgDefaultComponentRenderer<ImageView> {

    @Override
    protected void renderSelf(ImageView imageView, Context context, long nanovg) {
        Vector2f size = imageView.getSize();
        Vector2f position = imageView.getAbsolutePosition();

        createScissor(nanovg, imageView);
        {
            HashMap<String, Object> p = new HashMap<>();
            p.put(C_RADIUS, imageView.getStyle().getCornerRadius());

            renderImage(imageView.getImage(), position, size, p, context);
        }
        resetScissor(nanovg);
    }
}
