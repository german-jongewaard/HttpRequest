package com.jongewaard.dev.httprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json =
        "{" +
              "id: 0," +
              "city: [" +
                    "{" +
                        "id: 1," +
                        "name: 'London'" +
                    "}," +
                "{" +
                "id: 2," +
                "name: 'Buenos Aires'" +
              "}]" +
        "}";

        City city = null;

        Gson gson = new GsonBuilder().create();

        Town town = gson.fromJson(json, Town .class);

    }
}
