package com.jongewaard.dev.httprequest.api.apiServices;

import com.jongewaard.dev.httprequest.models.City;

import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Query;

/**
 * Created by german on 26-2-18.
 */

public interface WeatherService {

    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key);

    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key, @Query("units") String value);

    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key, @Query("units") String value, @Query("lang") String lang);
}
