package com.zybooks.testsplash;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.zybooks.testsplash.QuestionnaireQs.QuestionnaireQ1;

public class AssetsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assets_activity);

        // Begins the questionnaire by accessing screen with first question when clicked
        Button nextButton = (Button) findViewById(R.id.next_button);
        nextButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), QuestionnaireQ1.class);
            view.getContext().startActivity(intent);
        });

        // Returns to GuestLoginScreen when clicked
        ImageButton backButton = (ImageButton) findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), GuestLoginScreen.class);
            view.getContext().startActivity(intent);
        });

        // Begins the questionnaire by accessing screen with first question when clicked
        ImageButton forwardButton = (ImageButton) findViewById(R.id.forward_button);
        forwardButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), QuestionnaireQ1.class);
            view.getContext().startActivity(intent);
        });
    }
}