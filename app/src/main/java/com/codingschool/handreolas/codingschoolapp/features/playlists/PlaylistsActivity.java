package com.codingschool.handreolas.codingschoolapp.features.playlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codingschool.handreolas.codingschoolapp.R;
import com.codingschool.handreolas.codingschoolapp.features.tracks.TracksFragment;


public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.playlists_root, new PlaylistsFragment())
                .add(R.id.playlists_root, new TracksFragment())
                .commit();






    }
}
