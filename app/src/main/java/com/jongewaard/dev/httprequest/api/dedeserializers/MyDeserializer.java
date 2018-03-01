package com.jongewaard.dev.httprequest.api.dedeserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.jongewaard.dev.httprequest.models.City;

import java.lang.reflect.Type;

/**
 * Created by german on 28-2-18.
 */

public class MyDeserializer implements JsonDeserializer<City>{
    @Override
    public City deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        int id = json.getAsJsonObject().get("id").getAsInt();

        String name = json.getAsJsonObject().get("name").getAsString();

        String country = json.getAsJsonObject().get("sys").getAsJsonObject().get("country").getAsString();

        City city = new City(id, name, country);

        return city;
    }
}
