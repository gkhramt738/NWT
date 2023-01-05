package com.zybooks.testsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), UserLoginScreen.class);
            view.getContext().startActivity(intent);
        });

        Button guestButton = (Button) findViewById(R.id.guest_button);
        guestButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), GuestLoginScreen.class);
            view.getContext().startActivity(intent);
        });
    }
}