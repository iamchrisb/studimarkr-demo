package de.home.uni.studimarkr.client.common;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

import de.home.uni.studimarkr.client.activities.DashboardActivity;
import de.home.uni.studimarkr.client.activities.LoginActivity;
import de.home.uni.studimarkr.client.places.DashboardPlace;
import de.home.uni.studimarkr.client.places.LoginPlace;

public class AppActivityMapper implements ActivityMapper {

	private final ClientFactory factory;

	public AppActivityMapper(ClientFactory factory) {
		this.factory = factory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof LoginPlace) {
			return new LoginActivity((LoginPlace) place, factory);
		}
		if (place instanceof DashboardPlace) {
			return new DashboardActivity((DashboardPlace) place, factory);
		}

		return null;
	}

}
