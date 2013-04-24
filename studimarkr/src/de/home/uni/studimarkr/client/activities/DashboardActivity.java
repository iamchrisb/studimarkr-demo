package de.home.uni.studimarkr.client.activities;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import de.home.uni.studimarkr.client.common.ClientFactory;
import de.home.uni.studimarkr.client.places.DashboardPlace;
import de.home.uni.studimarkr.client.view.DashboardView;

public class DashboardActivity extends AbstractActivity implements
		DashboardView.Presenter {

	private final ClientFactory clientFactory;
	private final String name;

	public DashboardActivity(DashboardPlace place, ClientFactory clientFactory) {
		this.name = place.getDashboardName();
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		DashboardView view = clientFactory.getDashboardView();
		view.setName(name);
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
	}

	@Override
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}

}
