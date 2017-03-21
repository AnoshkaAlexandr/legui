package org.liquidengine.legui.listener;

import org.liquidengine.legui.event.MouseDragEvent;

/**
 * Created by Aliaksandr_Shcherbin on 2/9/2017.
 */
public interface MouseDragEventListener extends EventListener<MouseDragEvent> {

    /**
     * Used to process {@link MouseDragEvent}.
     *
     * @param event event to process.
     */
    @Override
    void process(MouseDragEvent event);
}
