package de.home.uni.studimarkr.client.presenter;

import java.util.List;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.Widget;

import de.home.uni.studimarkr.client.view.LoginView.Presenter;

public class LoginPresenter implements Presenter {

	@Override
	public void goTo(Place place) {
		
	}
	
	public interface Display extends HasValue<List<String>> {
		HasClickHandlers getLoginButton();
		HasClickHandlers getRegisterButton();
		Widget asWidget();
	}

}
