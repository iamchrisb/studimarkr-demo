package de.home.uni.studimarkr.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class NotLoggedInPlace extends Place {

	private final String notLoggedIn;

	public NotLoggedInPlace(String token) {
		this.notLoggedIn = token;
	}

	public String getName() {
		return notLoggedIn;
	}

	@Prefix("NotLoggedIn")
	public static class Tokenizer implements PlaceTokenizer<NotLoggedInPlace> {
		@Override
		public String getToken(NotLoggedInPlace place) {
			return place.getName();
		}

		@Override
		public NotLoggedInPlace getPlace(String token) {
			return new NotLoggedInPlace(token);
		}
	}

}
