package com.example.billy.swim_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoalSelectionPage extends AppCompatActivity {

    Button stayFitButton;
    Button specificGoalButton;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_selection_page);
        intent = new Intent(this, SpecificGoalActivity.class);

        setView();
        setButtonClicker();



    }


    public void setButtonClicker(){
        stayFitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent);

            }
        });

        specificGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }


    public void setView(){
        stayFitButton = (Button)findViewById(R.id.stayFitButton);
        specificGoalButton = (Button)findViewById(R.id.specificGoalButton);

    }

}
