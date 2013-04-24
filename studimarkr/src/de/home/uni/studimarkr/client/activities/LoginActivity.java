package de.home.uni.studimarkr.client.activities;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import de.home.uni.studimarkr.client.common.ClientFactory;
import de.home.uni.studimarkr.client.places.DashboardPlace;
import de.home.uni.studimarkr.client.places.LoginPlace;
import de.home.uni.studimarkr.client.view.LoginView;

public class LoginActivity extends AbstractActivity implements
		LoginView.Presenter {

	final static Logger LOGGER = Logger
			.getLogger(LoginActivity.class.getName());

	private final ClientFactory clientFactory;
	private final String name;

	private LoginView view;

	public LoginActivity(LoginPlace place, ClientFactory factory) {
		// use GIN to inject place, view, ..
		this.clientFactory = factory;
		this.name = place.getLoginName();
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		view = clientFactory.getLoginView();
		view.setName(name);
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
	}

	@Override
	public void goTo(Place place) {
		// fire event for the eventbus and change place
		clientFactory.getPlaceController().goTo(place);
	}

	@Override
	public void handleLoginButtonClicked() {
		if (checkUserCredentials()) {
			goTo(new DashboardPlace("home"));
			// clientFactory.getEventBus().fireEvent(PlaceChangeEvent<>)
			return;
		}
		Window.alert("wrong username or password :-(");
	}

	private boolean checkUserCredentials() {
		if (view != null) {
			// TODO real rest-service call
			if (view.getUsername().equals("Chris")
					&& view.getPassword().equals("123")) {
				/**
				 * TODO if true -> use localStorage / sessionStorage to keep the
				 * user logged in on other sides.
				 */
				return true;
			}
		}
		return false;
	}
}
