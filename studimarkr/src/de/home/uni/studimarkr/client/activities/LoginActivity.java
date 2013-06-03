package de.home.uni.studimarkr.client.activities;

import java.util.logging.Logger;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

import de.home.uni.studimarkr.client.model.User;
import de.home.uni.studimarkr.client.places.DashboardPlace;
import de.home.uni.studimarkr.client.view.LoginView;
import de.home.uni.studimarkr.client.view.LoginViewImpl;

public class LoginActivity extends AbstractActivity implements
LoginView.Presenter {

	final static Logger LOGGER = Logger
			.getLogger(LoginActivity.class.getName());

	private final LoginView view;
	private final PlaceController placeController;

	@Inject
	public LoginActivity(LoginView view, PlaceController placeController) {
		//TODO use GIN to inject place, view, .. not factory
		this.view = view;
		this.placeController = placeController;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		view.setName("login");
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
	}

	@Override
	public void goTo(Place place) {
		// fire event for the eventbus and change place
		placeController.goTo(place);
	}

	@Override
	public void handleLoginButtonClicked() {
		if (checkUserCredentials()) {
			goTo(new DashboardPlace());
			//TODO CHANGE GOTO TO EVENT clientFactory.getEventBus().fireEvent(PlaceChangeEvent<>)
			return;
		}
		Window.alert("wrong username or password :-(");
	}

	private boolean checkUserCredentials() {
		if (view != null) {
			//TODO USE REST CALL FOR GETTING USERS
			for (User user : LoginViewImpl.users) {
				if(view.getUsername().equals(user.name) && view.getPassword().equals(user.password)) {
					Storage localStorage = Storage.getLocalStorageIfSupported();
					localStorage.setItem(User.class.getName(), view.getUsername() + "," + view.getPassword());
					return true;
				}
			}
		}
		return false;
	}
}
