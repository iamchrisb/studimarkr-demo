package de.home.uni.studimarkr.client.gin;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;

import de.home.uni.studimarkr.client.places.LoginPlace;

@GinModules(StudimarkrGinModule.class)
public interface StudimarkrGinjector extends Ginjector {

	public EventBus getEventBus();

	public PlaceController getPlaceController();

	public LoginPlace getLoginPlace();

}
