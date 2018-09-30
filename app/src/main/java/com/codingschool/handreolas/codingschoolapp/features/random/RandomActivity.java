package com.codingschool.handreolas.codingschoolapp.features.random;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.codingschool.handreolas.codingschoolapp.R;
import com.codingschool.handreolas.codingschoolapp.features.playlists.PlaylistsFragment;
import com.codingschool.handreolas.codingschoolapp.features.tracks.TracksFragment;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.random_root, new PlaylistsFragment())
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.random_root, new TracksFragment())
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.random_root, new RandomFragment())
                .commit();

    }
}
