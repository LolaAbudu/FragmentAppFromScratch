package org.pursuit.fragmentappfromscratch.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.pursuit.fragmentappfromscratch.DisplayActivity;
import org.pursuit.fragmentappfromscratch.R;
import org.pursuit.fragmentappfromscratch.model.Planet;

public class PlanetViewHolder extends RecyclerView.ViewHolder {
    public static final String PLANET_NAME = "name";
    public static final String PLANET_NUMBER = "number";
    public static final String PLANET_IMAGE = "url";
    private TextView nameTextView;


    public PlanetViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.name_TextView);

    }

    public void onBind(final Planet planet){
        nameTextView.setText(planet.getName());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DisplayActivity.class);
                intent.putExtra(PLANET_NAME, planet.getName());
                intent.putExtra(PLANET_NUMBER, planet.getNumber());
                intent.putExtra(PLANET_IMAGE, planet.getImage());

                v.getContext().startActivity(intent);
            }
        });
    }
}
