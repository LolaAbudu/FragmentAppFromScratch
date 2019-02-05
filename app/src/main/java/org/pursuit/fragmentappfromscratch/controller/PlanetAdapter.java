package org.pursuit.fragmentappfromscratch.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.fragmentappfromscratch.R;
import org.pursuit.fragmentappfromscratch.model.Planet;
import org.pursuit.fragmentappfromscratch.view.PlanetViewHolder;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetViewHolder> {
    private List<Planet> planetList;

    public PlanetAdapter(List<Planet> planetList) {
        this.planetList = planetList;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.planet_itemview, parent, false);
        return new PlanetViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder planetViewHolder, int position) {
        planetViewHolder.onBind(planetList.get(position));
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }
}
