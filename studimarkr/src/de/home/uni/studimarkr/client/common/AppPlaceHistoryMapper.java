package de.home.uni.studimarkr.client.common;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

import de.home.uni.studimarkr.client.places.DashboardPlace;
import de.home.uni.studimarkr.client.places.LoginPlace;

@WithTokenizers({ LoginPlace.Tokenizer.class, DashboardPlace.Tokenizer.class, })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
