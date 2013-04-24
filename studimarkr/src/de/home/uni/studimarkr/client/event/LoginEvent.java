package de.home.uni.studimarkr.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class LoginEvent extends GwtEvent<LoginEventHandler> {

	@Override
	public GwtEvent.Type<LoginEventHandler> getAssociatedType() {
		return null;
	}

	@Override
	protected void dispatch(LoginEventHandler handler) {
		
	}

}
