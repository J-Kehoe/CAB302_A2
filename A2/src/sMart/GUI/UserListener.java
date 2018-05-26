package sMart;

import java.util.EventListener;

public interface UserListener extends EventListener {
	public void userEventHappened(UserEvent event);
}
