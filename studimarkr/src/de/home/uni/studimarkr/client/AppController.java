package de.home.uni.studimarkr.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;

public class AppController implements ValueChangeHandler<String> {

	private final HandlerManager eventBus;
	
	public AppController(HandlerManager eventBus) {
		this.eventBus = eventBus;
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		
	}
	
	

}
