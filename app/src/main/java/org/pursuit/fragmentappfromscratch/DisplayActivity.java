package org.pursuit.fragmentappfromscratch;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import org.pursuit.fragmentappfromscratch.view.PlanetViewHolder;

public class DisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent getStrings = getIntent();
        String planetName = getStrings.getStringExtra(PlanetViewHolder.PLANET_NAME);
        Integer planetNumber = getStrings.getIntExtra(PlanetViewHolder.PLANET_NUMBER, 1);
        String planetImage = getStrings.getStringExtra(PlanetViewHolder.PLANET_IMAGE);

        BlankFragment mainFragment = BlankFragment.newInstance(planetName, planetNumber, planetImage);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container, mainFragment).addToBackStack(null);
        fragmentTransaction.commit();
    }
}
