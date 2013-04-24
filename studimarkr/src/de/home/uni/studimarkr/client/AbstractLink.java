package de.home.uni.studimarkr.client;

public abstract class AbstractLink {

	protected String address;
	protected String timeStamp;
	protected String description;
	protected String[] categories;

	public AbstractLink(String address, String timeStamp, String description,
			String[] categories) {
		this.address = address;
		this.timeStamp = timeStamp;
		this.description = description;
		this.categories = categories;
	}

}
