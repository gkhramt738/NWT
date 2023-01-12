package com.zybooks.testsplash.QuestionnaireQs;

import com.zybooks.testsplash.R;
import static com.zybooks.testsplash.R.string.*;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.zybooks.testsplash.AssetsScreen;

public class QuestionnaireQ1 extends AppCompatActivity {

    private final String KEY = "editTextValue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_activities);

        // Override XML file with setting appropriate question count (question 1/X)
        TextView questionCount = findViewById(R.id.question_count);
        questionCount.setText(question1_20);

        // Override XML file with setting appropriate question (question 1)
        TextView questionText = findViewById(R.id.question_display);
        questionText.setText(q1);

        // Locates and saves the numerical value inputted by user for future calculations
        EditText userInputEditText = findViewById(R.id.input_value_edit_text);
        userInputEditText.setText(getValue());

        // Inflates icon text on icon click
        ImageView iconImage = findViewById(R.id.info_icon_image);
        iconImage.setOnClickListener(this::onInfoIconClickShowPopupWindow);

        // Accesses the next question when button is clicked (question 2)
        Button nextQuestion = (Button) findViewById(R.id.next_button);
        nextQuestion.setOnClickListener(view -> {
            // Saves user input for future calculations
                saveFromEditText(userInputEditText.getText().toString());

            // Launches next question activity
            Intent intent = new Intent(view.getContext(), QuestionnaireQ2.class);
            view.getContext().startActivity(intent);
        });

        // Returns to AssetsScreen when clicked
        ImageButton backButton = (ImageButton) findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> {
            // Saves user input for future calculations
            saveFromEditText(userInputEditText.getText().toString());

            // Returns to AssetsScreen
            Intent intent = new Intent(view.getContext(), AssetsScreen.class);
            view.getContext().startActivity(intent);
        });

        // Accesses the next question when button is clicked (question 2)
        ImageButton forwardButton = (ImageButton) findViewById(R.id.forward_button);
        forwardButton.setOnClickListener(view -> {
            // Saves user input for future calculations
            saveFromEditText(userInputEditText.getText().toString());

            // Launches next question activity
            Intent intent = new Intent(view.getContext(), QuestionnaireQ2.class);
            view.getContext().startActivity(intent);
        });
    }

    // Save user input
    private void saveFromEditText(String text) {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY, text);
        editor.apply();
    }

    // Retrieve user input
    private String getValue() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        String q1SavedValue = sharedPref.getString(KEY, "");

        return q1SavedValue;
    }

    // Display pop-up window when info icon is clicked
    public void onInfoIconClickShowPopupWindow(View view) {
        // Locate and inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popup_window, null);

        // Override XML file with setting appropriate info icon text
        TextView iconText = (TextView) popupView.getRootView().findViewById(R.id.popup_window);
        iconText.setText(R.string.q1_explanation);

        // Create the popup window with required parameters
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // Allows user to tap outside the popup window to close it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // Display the popup window in the center of the screen
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        // Close the popup window when anywhere on screen is touched
        popupView.setOnTouchListener((v, event) -> {
            popupWindow.dismiss();
            return true;
        });
    }

}