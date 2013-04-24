package de.home.uni.studimarkr.client;

import com.google.gwt.user.client.rpc.RemoteService;

public interface LinkManager extends RemoteService {

	Link[] getAllLinks();

	Link[] getLinksByCategory(String Category);

}
