package de.home.uni.studimarkr.client.view;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface LinkAddView extends IsWidget {

	void setLinkAddName(String name);

	void setPresenter(Presenter presenter);

	public interface Presenter {
		void goTo(Place place);
	}
}
