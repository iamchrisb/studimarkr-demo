package de.home.uni.studimarkr.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LinkManagerAsync {

	void getAllLinks(AsyncCallback<Link[]> callback);

	void getLinksByCategory(String Category, AsyncCallback<Link[]> callback);

}
