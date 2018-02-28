package com.jongewaard.dev.httprequest.models;

/**
 * Created by german on 26-2-18.
 */

public class City {

    private int id;
    private String name;
    private Temperature temperature;


    public City(){ }

    public City(int id, String name, Temperature temperature) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
