package de.home.uni.studimarkr.client.view;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface DashboardView extends IsWidget {

	void setName(String dashboardName);

	void setPresenter(Presenter presenter);

	public interface Presenter {
		void goTo(Place place);

	}

}
