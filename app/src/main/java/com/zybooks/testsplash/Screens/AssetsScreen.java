package com.zybooks.testsplash.Screens;

import com.zybooks.testsplash.*;
import com.zybooks.testsplash.QuestionnaireQs.QuestionnaireQ1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AssetsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assets_activity);

        // Inflates icon text on icon click
        ImageView iconImage = findViewById(R.id.info_icon_image);
        iconImage.setOnClickListener(this::onInfoIconClickShowPopupWindow);

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

    // Display pop-up window when info icon is clicked
    @SuppressLint("ClickableViewAccessibility")
    public void onInfoIconClickShowPopupWindow(View view) {
        // Locate and inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View popupView = inflater.inflate(R.layout.popup_window, null);

        // Override XML file with setting appropriate info icon text
        TextView iconText = popupView.getRootView().findViewById(R.id.popup_window);
        iconText.setText(R.string.round_answer);

        // Create the popup window with required parameters
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // Allows user to tap outside the popup window to close it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // Display the popup window in the center of the screen
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 8);

        // Close the popup window when anywhere on screen is touched
        popupView.setOnTouchListener((v, event) -> {
            popupWindow.dismiss();
            return true;
        });
    }

}