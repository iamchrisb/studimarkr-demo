package de.home.uni.studimarkr.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

import de.home.uni.studimarkr.client.view.LoginViewImpl;

public class TestEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel container =RootPanel.get("LoginContainer");
		HandlerManager eventbus = new HandlerManager(null);
		AppController controller = new AppController(eventbus);
		container.add(new LoginViewImpl());
	}

}
