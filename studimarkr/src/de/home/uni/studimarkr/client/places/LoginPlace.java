package de.home.uni.studimarkr.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class LoginPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<LoginPlace> {
		@Override
		public String getToken(LoginPlace place) {
			return "LoginPlace";
		}

		@Override
		public LoginPlace getPlace(String token) {
			return new LoginPlace();
		}
	}

}
