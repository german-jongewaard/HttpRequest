package com.jongewaard.dev.httprequest;

/**
 * Created by german on 26-2-18.
 */

public class City {

    public int id;
    public String name;

    public City(){ }

    public City(int id, String name) {
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
