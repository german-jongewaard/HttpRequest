package com.jongewaard.dev.httprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://samples.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())//esto crea una factoria de Gson que se le agrega a Retrofit
                .build();

        WeatherService service = retrofit.create(WeatherService.class);

        Call<List<City>> cityCall = service.getCity("Nîmes, FR", "");

        cityCall.enqueue(new Callback<List<City>>() {
            @Override
            public void onResponse(Call<List<City>> call, Response<List<City>> response) {

                List<City> city = response.body();
            }

            @Override
            public void onFailure(Call<List<City>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
            }
        });


    }
}
