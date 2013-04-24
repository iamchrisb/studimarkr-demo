package de.home.uni.studimarkr.client.common;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

import de.home.uni.studimarkr.client.view.DashboardView;
import de.home.uni.studimarkr.client.view.LinkAddView;
import de.home.uni.studimarkr.client.view.LoginView;

public interface ClientFactory {

	EventBus getEventBus();

	PlaceController getPlaceController();

	LoginView getLoginView();

	DashboardView getDashboardView();

	LinkAddView getLinkAddView();

}
