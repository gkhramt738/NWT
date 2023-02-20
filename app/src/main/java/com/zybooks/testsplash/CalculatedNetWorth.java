package com.zybooks.testsplash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.zybooks.testsplash.QuestionnaireQs.QuestionnaireQ16;
import com.zybooks.testsplash.QuestionnaireQs.QuestionnaireQ18;

public class CalculatedNetWorth extends AppCompatActivity {

    private int totalNetWorth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculated_nw_screen);

        // Returns to QuestionnaireQ18 when clicked
        ImageButton backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), QuestionnaireQ18.class);
            view.getContext().startActivity(intent);
        });

        // Accesses the main screen (MainActivity) when left button is clicked
        Button mainScreenButton = findViewById(R.id.main_screen_button);
        mainScreenButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), MainActivity.class);
            view.getContext().startActivity(intent);
        });

//        Retrieve total net worth value
//        NetWorthCalculation calculateNW = new NetWorthCalculation();
//        totalNetWorth = calculateNW.getItemsToCalculate();
//        displayTotalNW();

    }

//    private void displayTotalNW() {
//        // Update and display the textview with the calculated user net worth
//        TextView netWorth = findViewById(R.id.netWorthOutput);
//        netWorth.setText({totalNetWorth});
//    }


}
