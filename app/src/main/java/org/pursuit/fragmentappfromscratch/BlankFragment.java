package org.pursuit.fragmentappfromscratch;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    private TextView nameTextView;
    private TextView numberTextView;
    private ImageView imageImageView;

    private View rootview;

    private String mParam1;
    private int mParam2;
    private String mparam3;


    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(String param1, int param2, String param3) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
            mparam3 = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_blank, container, false);
        nameTextView = rootview.findViewById(R.id.display_name_TextView);
        numberTextView = rootview.findViewById(R.id.display_number_TextView);
        imageImageView = rootview.findViewById(R.id.display_image_ImageView);

        nameTextView.setText(mParam1);
        numberTextView.setText(String.valueOf(mParam2));
        Picasso.get().load(mparam3).into(imageImageView);

        // Inflate the layout for this fragment
        return rootview;
    }

}
