package com.jongewaard.dev.httprequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by german on 26-2-18.
 */

public class Town {

    public int id;
    public City city;

    public Town(){}

    public Town(int id, City city){
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public City parseJSON(String response){

        Gson gson = new GsonBuilder().create();
        City city = gson.fromJson(response, City.class);
        return city;

    }
}
