package com.zybooks.testsplash.QuestionnaireQs;

import com.zybooks.testsplash.R;
import static com.zybooks.testsplash.R.string.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class QuestionnaireQ2 extends BaseQuestionnaire {
    private final String KEY = "editTextValue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //overridePendingTransition(R.anim.fadein, R.anim.fadeout);
//        overridePendingTransition(R.anim.animation_enter,
//                R.anim.animation_leave);
        setContentView(R.layout.questionnaire_activities);

        // Override XML file with setting appropriate question count (question 2/X)
        TextView questionCount = findViewById(R.id.question_count);
        questionCount.setText(question2_20);

        // Override XML file with setting appropriate question (question 2)
        TextView questionText = findViewById(R.id.header);
        questionText.setText(q2);

        // Locates and saves the numerical value inputted by user for future calculations
        EditText userInputEditText = findViewById(R.id.input_value_edit_text);
        userInputEditText.setText(getValue(KEY));

        // Inflates icon text on icon click
        ImageView iconImage = findViewById(R.id.info_icon_image);
        iconImage.setOnClickListener(this::onInfoIconClickShowPopupWindow);

        // Accesses the next question when button is clicked (question 3)
        Button nextQuestion = findViewById(R.id.next_button);
        nextQuestion.setOnClickListener(view -> {
            // Saves user input for future calculations
            saveUserInput(KEY, "q2", userInputEditText.getText().toString());

            // Launches next question activity
            Intent intent = new Intent(view.getContext(), QuestionnaireQ3.class);
            view.getContext().startActivity(intent);
        });

        // Returns to QuestionnaireQ1 when clicked
        ImageButton backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> {
            // Saves user input for future calculations
            saveUserInput(KEY, "q2", userInputEditText.getText().toString());

            // Returns to previous question activity
            Intent intent = new Intent(view.getContext(), QuestionnaireQ1.class);
            view.getContext().startActivity(intent);
        });

        // Accesses the next question when button is clicked (question 3)
        ImageButton forwardButton = findViewById(R.id.forward_button);
        forwardButton.setOnClickListener(view -> {
            // Saves user input for future calculations
            saveUserInput(KEY, "q2", userInputEditText.getText().toString());

            // Launches next question activity
            Intent intent = new Intent(view.getContext(), QuestionnaireQ3.class);
            view.getContext().startActivity(intent);
        });

    }

    // Display pop-up window when info icon is clicked
    public void onInfoIconClickShowPopupWindow(View view) {
        // Locate and inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View popupView = inflater.inflate(R.layout.popup_window, null);

        // Override XML file with setting appropriate info icon text
        TextView iconText = popupView.getRootView().findViewById(R.id.popup_window);
        iconText.setText(R.string.q2_explanation);
        showExplanationPopupWindow(popupView,view);
    }

}