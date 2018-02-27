package com.jongewaard.dev.httprequest;

import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Query;

/**
 * Created by german on 26-2-18.
 */

public interface WeatherService {

    //http://samples.openweathermap.org/data/2.5/forecast?id
    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key);

}
