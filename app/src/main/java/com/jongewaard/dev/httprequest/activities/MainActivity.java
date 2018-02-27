package com.jongewaard.dev.httprequest.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jongewaard.dev.httprequest.models.City;
import com.jongewaard.dev.httprequest.R;
import com.jongewaard.dev.httprequest.api.apiServices.WeatherService;

import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/data/2.5/")
        //"http://samples.openweathermap.org/data/2.5/"
                .addConverterFactory(GsonConverterFactory.create())//esto crea una factoria de Gson que se le agrega a Retrofit
                .build();

        WeatherService service = retrofit.create(WeatherService.class);

        Call<City> cityCall = service.getCity("Nimes,FR", "");

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
