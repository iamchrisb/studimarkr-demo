package de.home.uni.studimarkr.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class DashboardPlace extends Place{
	
	private String name;

	public DashboardPlace(String token) {
		this.name = token;
	}
	
	public String getDashboardName() {
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<DashboardPlace> {

		@Override
		public DashboardPlace getPlace(String token) {
			return new DashboardPlace(token);
		}

		@Override
		public String getToken(DashboardPlace place) {
			return place.getDashboardName();
		}
		
	}
}
