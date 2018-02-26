package com.jongewaard.dev.httprequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by german on 26-2-18.
 */

public class Town {

    public int id;
    public List<City> cities;

    public Town(){}

    public Town(int id, List<City> cities){
        this.id = id;
        this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<City> getCity() {
        return cities;
    }

    public void setCity(List<City> city) {
        this.cities = cities;
    }

    public City parseJSON(String response){

        Gson gson = new GsonBuilder().create();
        City cities = gson.fromJson(response, City.class);
        return cities;

    }
}
