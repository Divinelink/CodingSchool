package com.codingschool.handreolas.codingschoolapp.features.playlists;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.codingschool.handreolas.codingschoolapp.R;
import com.codingschool.handreolas.codingschoolapp.features.tracks.TracksActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaylistsFragment extends Fragment {

    TextView mTextView, m2TextView;
    Button mButton, m2Button;

    public PlaylistsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_playlists, container, false);

        mTextView = v.findViewById(R.id.welcome_test_id);
        m2TextView = v.findViewById(R.id.welcome_test_id_2);

        mButton = v.findViewById(R.id.my_button);
        m2Button = v.findViewById(R.id.my_second_button);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setTextColor(getResources().getColor(R.color.colorAccent));
                Log.e("TAG_CS", "Tag button got clicked and changed the color of the textview");
            }
        });

        m2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), TracksActivity.class);
                startActivity(intent);

            }
        });

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                mTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40);
            }
        });

        return v;
    }

}
