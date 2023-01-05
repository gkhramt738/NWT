package com.zybooks.testsplash.questionAsks;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.zybooks.testsplash.R;

public class QuestionnaireQ2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_1);

        // Begins the questionnaire by accessing screen with first question when clicked
        Button beginButton = (Button) findViewById(R.id.next_button);
        beginButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), QuestionnaireQ3.class);
            view.getContext().startActivity(intent);
        });

        // Returns to MainActivity (the home screen) when clicked
        ImageButton backButton = (ImageButton) findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), QuestionnaireQ1.class);
            view.getContext().startActivity(intent);
        });

        // Begins the questionnaire by accessing screen with first question when clicked
        ImageButton forwardButton = (ImageButton) findViewById(R.id.forward_button);
        forwardButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), QuestionnaireQ3.class);
            view.getContext().startActivity(intent);
        });

    }
}
