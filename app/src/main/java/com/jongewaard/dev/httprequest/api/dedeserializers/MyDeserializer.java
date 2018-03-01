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
        // JsonObject obj = json.getAsJsonObject().get("weather").getAsJsonArray().get(0).getAsJsonObject();
        String icon = json.getAsJsonObject().get("weather").getAsJsonArray().get(0).getAsJsonObject().get("icon").getAsString();
        String description = json.getAsJsonObject().get("weather").getAsJsonArray().get(0).getAsJsonObject().get("description").getAsString();
        int temp = json.getAsJsonObject().get("main").getAsJsonObject().get("temp").getAsInt();

        City city = new City(id, name, country, icon, description, temp);
        return city;
    }
}
