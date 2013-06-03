package de.home.uni.studimarkr.client.common;

import de.home.uni.studimarkr.client.model.User;

public interface LocalStorageFacade {

	User getUser();

	void setUser(User user);

}
