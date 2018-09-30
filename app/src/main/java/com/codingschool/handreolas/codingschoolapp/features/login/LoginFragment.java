package com.codingschool.handreolas.codingschoolapp.features.login;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.codingschool.handreolas.codingschoolapp.R;
import com.codingschool.handreolas.codingschoolapp.features.playlists.PlaylistsActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    EditText mEmailEditText, mPasswordEditText;
    Button mLoginButton;

    public LoginFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        mEmailEditText = v.findViewById(R.id.user_email);
        mPasswordEditText = v.findViewById(R.id.user_password);
        mLoginButton = v.findViewById(R.id.login_button);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (credentialsAreCorrect())
                {
                    Intent intent = new Intent(getActivity(), PlaylistsActivity.class);
                    startActivity(intent);
                    getActivity().finish();
                }
                else
                {
                    Toast.makeText(getActivity(), getResources().getString(R.string.credentials_text), Toast.LENGTH_SHORT).show();
                }

            }
        });
        return v;
    }

    private boolean credentialsAreCorrect() {
        return (mEmailEditText.getText().toString().equals("Haris") && mPasswordEditText.getText().toString().equals("123456789"));
    }

}
