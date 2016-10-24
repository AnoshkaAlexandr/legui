package org.liquidengine.legui.processor;

import org.liquidengine.legui.component.Component;
import org.liquidengine.legui.event.SystemEvent;
import org.liquidengine.legui.listener.SystemEventListener;

/**
 * Created by Shcherbin Alexander on 10/24/2016.
 */
public abstract class SystemEventListenerProvider {

    public static SystemEventListenerProvider getProvider() {
        return PH.PROVIDER;
    }

    public static void setProvider(SystemEventListenerProvider provider) {
        PH.PROVIDER = provider;
    }

    public abstract <C extends Component, E extends SystemEvent> SystemEventListener getListener(Class<C> componentClass, Class<E> eventcClass);

    private static final class PH {
        private static SystemEventListenerProvider PROVIDER = new DefaultSystemEventListenerProvider();
    }
}
