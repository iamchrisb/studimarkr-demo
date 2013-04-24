package de.home.uni.studimarkr.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;

import de.home.uni.studimarkr.client.common.AppActivityMapper;
import de.home.uni.studimarkr.client.common.AppPlaceHistoryMapper;
import de.home.uni.studimarkr.client.common.ClientFactory;
import de.home.uni.studimarkr.client.common.ClientFactoryImpl;
import de.home.uni.studimarkr.client.places.LoginPlace;

public class TestEntryPoint implements EntryPoint {

	private final Place defaultPlace = new LoginPlace("login");
	private final SimplePanel appPanel = new SimplePanel();

	@Override
	public void onModuleLoad() {
		ClientFactory clientFactory = GWT.create(ClientFactoryImpl.class);
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();

		ActivityMapper activityMapper = new AppActivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(activityMapper,
				eventBus);
		activityManager.setDisplay(appPanel);

		AppPlaceHistoryMapper historyMapper = GWT
				.create(AppPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(
				historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);

		RootPanel.get("LoginContainer").add(appPanel);
		historyHandler.handleCurrentHistory();
	}

}
