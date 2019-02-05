package org.pursuit.fragmentappfromscratch.network;

import org.pursuit.fragmentappfromscratch.model.PlanetList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PlanetServices {

    @GET("JDVila/storybook/master/planets.json")
    Call<PlanetList> getPlanet();
}
