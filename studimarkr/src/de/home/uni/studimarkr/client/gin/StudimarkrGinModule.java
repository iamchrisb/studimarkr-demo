package de.home.uni.studimarkr.client.gin;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Singleton;

import de.home.uni.studimarkr.client.activities.DashboardActivity;
import de.home.uni.studimarkr.client.activities.LoginActivity;
import de.home.uni.studimarkr.client.common.LocalStorageFacade;
import de.home.uni.studimarkr.client.common.LocalStorageFacadeImpl;
import de.home.uni.studimarkr.client.places.DashboardPlace;
import de.home.uni.studimarkr.client.places.LoginPlace;
import de.home.uni.studimarkr.client.provider.PlaceControllerProvider;
import de.home.uni.studimarkr.client.view.DashboardView;
import de.home.uni.studimarkr.client.view.DashboardViewImpl;
import de.home.uni.studimarkr.client.view.LinkAddComposite;
import de.home.uni.studimarkr.client.view.LinkAddView;
import de.home.uni.studimarkr.client.view.LoginView;
import de.home.uni.studimarkr.client.view.LoginViewImpl;

public class StudimarkrGinModule extends AbstractGinModule {

	@Override
	protected void configure() {

		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

		bind(LocalStorageFacade.class).to(LocalStorageFacadeImpl.class);

		//providers
		bind(PlaceController.class).toProvider(PlaceControllerProvider.class).in(Singleton.class);

		//views
		bind(LoginView.class).to(LoginViewImpl.class).in(Singleton.class);
		bind(DashboardView.class).to(DashboardViewImpl.class).in(Singleton.class);
		bind(LinkAddView.class).to(LinkAddComposite.class).in(Singleton.class);

		//activites
		bind(LoginActivity.class);
		bind(DashboardActivity.class);

		//places
		bind(LoginPlace.class);
		bind(DashboardPlace.class);

	}

}
