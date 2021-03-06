package org.liquidengine.legui.event;

import org.liquidengine.legui.component.Component;
import org.liquidengine.legui.component.Frame;
import org.liquidengine.legui.system.context.Context;

/**
 * Created by ShchAlexander on 2/2/2017.
 */
public class WindowSizeEvent<T extends Component> extends Event<T> {

    private final int width;
    private final int height;

    public WindowSizeEvent(T component, Context context, Frame frame, int width, int height) {
        super(component, context, frame);
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
