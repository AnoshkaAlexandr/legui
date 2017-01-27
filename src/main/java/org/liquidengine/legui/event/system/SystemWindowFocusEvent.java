package org.liquidengine.legui.event.system;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.liquidengine.legui.event.SystemEvent;

/**
 * Created by Shcherbin Alexander on 6/10/2016.
 */
public class SystemWindowFocusEvent implements SystemEvent {
    public final long window;
    public final boolean focused;

    public SystemWindowFocusEvent(long window, boolean focused) {
        this.window = window;
        this.focused = focused;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("window", window)
                .append("focused", focused)
                .toString();
    }

}