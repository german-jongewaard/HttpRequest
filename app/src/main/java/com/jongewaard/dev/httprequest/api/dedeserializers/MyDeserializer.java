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



        return null;
    }
}
