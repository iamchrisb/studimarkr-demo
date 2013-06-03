package de.home.uni.studimarkr.client;

import java.util.List;

public class StandardLink extends AbstractLink implements Link {

	public StandardLink(String address, String name, String timeStamp, String description,
			List<String> categories) {
		super(address, name, timeStamp, description, categories);
	}

	@Override
	public List<String> getCategories() {
		return categories;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getAdress() {
		return adress;
	}

}
