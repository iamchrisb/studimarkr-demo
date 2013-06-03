package de.home.uni.studimarkr.client.activities;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import de.home.uni.studimarkr.client.common.LocalStorageFacade;
import de.home.uni.studimarkr.client.model.User;
import de.home.uni.studimarkr.client.places.LoginPlace;
import de.home.uni.studimarkr.client.view.LoginViewImpl;

public abstract class SecureActivity extends AbstractActivity {

	protected LocalStorageFacade storage;
	private final PlaceController placeController;

	public SecureActivity(LocalStorageFacade storage, PlaceController placeController) {
		this.storage = storage;
		this.placeController = placeController;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {

		if(storage == null) {
			//TODO if storage null
		}

		User currentUser = storage.getUser();

		if(currentUser == null) {
			placeController.goTo(new LoginPlace());
		}

		if(!LoginViewImpl.users.contains(currentUser)) {
			//TODO CHANGE USERS TO REST CALL
			placeController.goTo(new LoginPlace());
			return;
		}
	}

}
