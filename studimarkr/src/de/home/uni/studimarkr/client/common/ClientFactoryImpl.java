package de.home.uni.studimarkr.client.common;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

import de.home.uni.studimarkr.client.view.DashboardView;
import de.home.uni.studimarkr.client.view.DashboardViewImpl;
import de.home.uni.studimarkr.client.view.LinkAddComposite;
import de.home.uni.studimarkr.client.view.LinkAddView;
import de.home.uni.studimarkr.client.view.LoginView;
import de.home.uni.studimarkr.client.view.LoginViewImpl;

public class ClientFactoryImpl implements ClientFactory {

	private final SimpleEventBus eventBus;
	private final PlaceController placeController;
	private final LoginViewImpl loginView;
	private final DashboardViewImpl dashboardView;
	private final LinkAddView linkAddView;

	public ClientFactoryImpl() {
		this.eventBus = new SimpleEventBus();
		this.placeController = new PlaceController(eventBus);
		this.loginView = new LoginViewImpl();
		this.dashboardView = new DashboardViewImpl();
		this.linkAddView = new LinkAddComposite();
	}

	@Override
	public EventBus getEventBus() {
		return this.eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return this.placeController;
	}

	@Override
	public LoginView getLoginView() {
		return this.loginView;
	}

	@Override
	public DashboardView getDashboardView() {
		return this.dashboardView;
	}

	@Override
	public LinkAddView getLinkAddView() {
		return this.linkAddView;
	}

}
