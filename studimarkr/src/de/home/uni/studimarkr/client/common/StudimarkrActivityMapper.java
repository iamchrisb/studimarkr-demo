package de.home.uni.studimarkr.client.common;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

import de.home.uni.studimarkr.client.activities.DashboardActivity;
import de.home.uni.studimarkr.client.activities.LoginActivity;
import de.home.uni.studimarkr.client.places.DashboardPlace;
import de.home.uni.studimarkr.client.places.LoginPlace;

public class StudimarkrActivityMapper implements ActivityMapper {

	@Inject Provider<LoginActivity> loginActivityProvider;
	@Inject Provider<DashboardActivity> dashboardActivityProvider;

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof LoginPlace) {
			return loginActivityProvider.get();
			//			return new LoginActivity((LoginPlace) place, injector.getLoginView());
		}
		if (place instanceof DashboardPlace) {
			return dashboardActivityProvider.get();
			//			return new DashboardActivity((DashboardPlace) place, injector.getDashboardView());
		}
		return null;
	}

}
