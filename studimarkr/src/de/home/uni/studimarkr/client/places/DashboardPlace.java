package de.home.uni.studimarkr.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class DashboardPlace extends Place{

	private final String name;

	public DashboardPlace() {
		name = "DashboardPlace";
	}

	public String getDashboardName() {
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<DashboardPlace> {

		@Override
		public DashboardPlace getPlace(String token) {
			return new DashboardPlace();
		}

		@Override
		public String getToken(DashboardPlace place) {
			return place.getDashboardName();
		}

	}
}
