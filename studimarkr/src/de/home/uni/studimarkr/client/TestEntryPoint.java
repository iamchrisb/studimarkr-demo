package de.home.uni.studimarkr.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class TestEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel container =RootPanel.get("LoginContainer");
		container.add(new LoginViewImpl());
	}

}