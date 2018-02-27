package com.jongewaard.dev.httprequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Query;

/**
 * Created by german on 26-2-18.
 */

public interface WeatherService {

    @GET("users/{user}/repos")
    Call<List<City>> listRepos(@Query("user") String user);

}
