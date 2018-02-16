package com.example.usuario.swapiexample.api;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SwapiService {

    @GET("people")
    Observable<PeopleResponse> getPeople();



    @GET("planets/{id}")
    Observable<PlanetResponse> getPlanet(@Path("id") int planetId);

}
