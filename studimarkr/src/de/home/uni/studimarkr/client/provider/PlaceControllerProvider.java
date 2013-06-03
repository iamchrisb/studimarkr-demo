package de.home.uni.studimarkr.client.provider;

import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class PlaceControllerProvider implements Provider<PlaceController> {

	private final SimpleEventBus eventBus;

	@Inject
	public PlaceControllerProvider(SimpleEventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override
	public PlaceController get() {
		return new PlaceController(eventBus);
	}

}

