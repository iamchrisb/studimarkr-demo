package de.home.uni.studimarkr.client.common;

import com.google.gwt.storage.client.Storage;

import de.home.uni.studimarkr.client.model.User;

public class LocalStorageFacadeImpl implements LocalStorageFacade {

	private final Storage localStrorage;

	public LocalStorageFacadeImpl() {
		localStrorage =  Storage.getLocalStorageIfSupported();
	}

	@Override
	public User getUser() {
		String k = localStrorage.getItem(User.class.getName());

		if(k == null || k.isEmpty()){
			return null;
		}

		String[] kAr = k.split(",");
		return new User(kAr[0], kAr[1]);
	}

	@Override
	public void setUser(User user) {
		localStrorage.setItem(User.class.getName(), user.name + "," + user.password);
	}

}
