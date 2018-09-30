package com.codingschool.handreolas.codingschoolapp.features.random;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.codingschool.handreolas.codingschoolapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RandomFragment extends Fragment {


    TextView mTextView, m1TextView, m2TextView, m3TextView, m4TextView;

    public RandomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_random, container, false);

        mTextView = v.findViewById(R.id.randomTextView);
        m1TextView = v.findViewById(R.id.randomTextView1);
        m2TextView = v.findViewById(R.id.randomTextView2);
        m3TextView = v.findViewById(R.id.randomTextView3);
        m4TextView = v.findViewById(R.id.randomTextView4);
        return v;
    }

}
