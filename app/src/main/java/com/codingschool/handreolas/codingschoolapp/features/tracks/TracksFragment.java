package com.codingschool.handreolas.codingschoolapp.features.tracks;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.codingschool.handreolas.codingschoolapp.R;
import com.codingschool.handreolas.codingschoolapp.features.random.RandomActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class TracksFragment extends Fragment {

    Button mButton;
    TextView mTextView;

    public TracksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tracks, container, false);

        mTextView = v.findViewById(R.id.fragment_tracks_view);

        mButton = v.findViewById(R.id.my_button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RandomActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return v;
    }

}
