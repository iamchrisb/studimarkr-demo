package de.home.uni.studimarkr.client;

import java.util.List;

public abstract class AbstractLink {

	protected String adress;
	protected String name;
	protected String timeStamp;
	protected String description;
	protected List<String> categories;

	public AbstractLink(String address, String name, String timeStamp, String description,
			List<String> categories) {
		this.adress = address;
		this.timeStamp = timeStamp;
		this.description = description;
		this.categories = categories;
		this.name = name;
	}

}
