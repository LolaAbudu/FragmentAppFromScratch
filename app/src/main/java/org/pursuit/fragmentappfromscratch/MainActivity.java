package org.pursuit.fragmentappfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import org.pursuit.fragmentappfromscratch.controller.PlanetAdapter;
import org.pursuit.fragmentappfromscratch.model.Planet;
import org.pursuit.fragmentappfromscratch.model.PlanetList;
import org.pursuit.fragmentappfromscratch.network.PlanetServices;
import org.pursuit.fragmentappfromscratch.network.RetrofitSingleton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.planet_recycler_view);

        Retrofit retrofit = RetrofitSingleton.getInstance();
        PlanetServices planetServices = retrofit.create(PlanetServices.class);
        Call<PlanetList> planetCall = planetServices.getPlanet();
        planetCall.enqueue(new Callback<PlanetList>() {
            @Override
            public void onResponse(Call<PlanetList> call, Response<PlanetList> response) {
                List<Planet> planetList = response.body().getPlanets();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                PlanetAdapter planetAdapter = new PlanetAdapter(planetList);
                recyclerView.setAdapter(planetAdapter);
                recyclerView.setLayoutManager(linearLayoutManager);
                Log.d(TAG, "This retrofit call works Lola " + response.body());
            }

            @Override
            public void onFailure(Call<PlanetList> call, Throwable t) {

            }
        });
    }
}
