package com.jongewaard.dev.httprequest.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jongewaard.dev.httprequest.api.API;
import com.jongewaard.dev.httprequest.models.City;
import com.jongewaard.dev.httprequest.R;
import com.jongewaard.dev.httprequest.api.apiServices.WeatherService;

import retrofit2.*;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        WeatherService service = API.getApi().create(WeatherService.class);

        Call<City> cityCall = service.getCityCelsius("Nimes,FR", API.APPKEY, "metric");

        cityCall.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {

                City city = response.body();
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
            }
        });


    }
}
