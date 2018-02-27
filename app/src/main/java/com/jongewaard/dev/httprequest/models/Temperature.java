package com.jongewaard.dev.httprequest.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by german on 27-2-18.
 */

public class Temperature {


    @SerializedName("main") private float temp;
    private float pressure;
    private float humidity;
    @SerializedName("temp_min") private float tempMin;
    @SerializedName("temp_max") private float tempMax;
    private float visibility;

    public Temperature(){}

    public Temperature(float temp, float pressure, float humidity, float tempMin, float tempMax, float visibility) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.visibility = visibility;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    public float getVisibility() {
        return visibility;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }
}
