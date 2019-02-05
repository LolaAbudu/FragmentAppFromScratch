package org.pursuit.fragmentappfromscratch;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.pursuit.fragmentappfromscratch.view.PlanetViewHolder;

public class DisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent getStrings = getIntent();
        String planetName = getStrings.getStringExtra(PlanetViewHolder.PLANET_NAME);
        String planetNumber = getStrings.getStringExtra(PlanetViewHolder.PLANET_NUMBER);
        String planetImage = getStrings.getStringExtra(PlanetViewHolder.PLANET_IMAGE);
    }
}
