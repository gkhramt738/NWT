package com.zybooks.testsplash;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GuestLoginScreen extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guest_login);

        // Begins the questionnaire by accessing screen with first question when clicked
        Button beginButton = (Button) findViewById(R.id.next_button);
        beginButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), AssetsScreen.class);
            view.getContext().startActivity(intent);
        });

        // Returns to MainActivity (the home screen) when clicked
        ImageButton backButton = (ImageButton) findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), MainActivity.class);
            view.getContext().startActivity(intent);
        });

        // Begins the questionnaire by accessing screen with first question when clicked
        ImageButton forwardButton = (ImageButton) findViewById(R.id.forward_button);
        forwardButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), AssetsScreen.class);
            view.getContext().startActivity(intent);
        });

    }
}
