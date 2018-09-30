package com.codingschool.handreolas.codingschoolapp.features.tracks;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.codingschool.handreolas.codingschoolapp.R;
import com.codingschool.handreolas.codingschoolapp.features.playlists.PlaylistsActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class TracksFragment extends Fragment {

    Button mButton;

    public TracksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_tracks, container, false);

        mButton = v.findViewById(R.id.my_button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PlaylistsActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }

}
