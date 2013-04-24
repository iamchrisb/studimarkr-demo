package de.home.uni.studimarkr.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class LoginPlace extends Place {

	private final String loginName;

	public LoginPlace(String token) {
		this.loginName = token;
	}

	public String getLoginName() {
		return loginName;
	}

	@Prefix("Kekse")
	public static class Tokenizer implements PlaceTokenizer<LoginPlace> {
		@Override
		public String getToken(LoginPlace place) {
			return place.getLoginName();
		}

		@Override
		public LoginPlace getPlace(String token) {
			return new LoginPlace(token);
		}
	}

}
