package de.home.uni.studimarkr.client;

public class StandardLink extends AbstractLink implements Link {

	public StandardLink(String address, String timeStamp, String description,
			String[] categories) {
		super(address, timeStamp, description, categories);
	}

	@Override
	public String[] getCategories() {
		return null;
	}

}
