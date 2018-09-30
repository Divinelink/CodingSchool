package com.codingschool.handreolas.codingschoolapp.features.tracks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codingschool.handreolas.codingschoolapp.R;
import com.codingschool.handreolas.codingschoolapp.features.playlists.PlaylistsActivity;

public class TracksActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.tracks_root, new TracksFragment())
                .commit();
    }
}
