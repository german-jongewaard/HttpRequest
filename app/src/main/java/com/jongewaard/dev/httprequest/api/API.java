package com.jongewaard.dev.httprequest.api;

import com.google.gson.GsonBuilder;
import com.jongewaard.dev.httprequest.api.dedeserializers.MyDeserializer;
import com.jongewaard.dev.httprequest.models.City;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by german on 27-2-18.
 */

public class API {

    public static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";

    private static Retrofit retrofit = null;

    public static final String APPKEY = "";

    //pequeño sigelton - crear una instancia para reutilizarla.

    public static Retrofit getApi(){
        //si es Nulo lo creamos y sino lo devuelve.
        if(retrofit == null){
            GsonBuilder builder = new GsonBuilder();
            //de esta forma estoy registrando mi Deserializador
            builder.registerTypeAdapter(City.class, new MyDeserializer());

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    //esto crea una factoria de Gson que se le agrega a Retrofit
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }



}
