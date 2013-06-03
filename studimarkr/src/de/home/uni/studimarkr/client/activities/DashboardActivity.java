package de.home.uni.studimarkr.client.activities;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

import de.home.uni.studimarkr.client.common.LocalStorageFacade;
import de.home.uni.studimarkr.client.places.DashboardPlace;
import de.home.uni.studimarkr.client.view.DashboardView;

public class DashboardActivity extends SecureActivity implements
DashboardView.Presenter {

	private final String name;
	private final DashboardView view;
	private final PlaceController placeController;

	@Inject
	public DashboardActivity(DashboardPlace place, DashboardView view, PlaceController placeController, LocalStorageFacade storage) {
		super(storage, placeController);
		name = place.getDashboardName();
		this.view = view;
		this.placeController = placeController;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		super.start(panel, eventBus);
		view.setName(name);
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
	}

	@Override
	public void goTo(Place place) {
		placeController.goTo(place);
	}

}
