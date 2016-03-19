package com.example.billy.swim_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class InfoActivity extends AppCompatActivity {

    ArrayAdapter<CharSequence> staticAdapter;
    ArrayAdapter<CharSequence> levelAdapter;
    Spinner genderSpinner;
    Spinner levelSpinner;
    Button quickStartButton;
    Button nextButton;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        intent = new Intent(this, GoalSelectionPage.class);

        setView();
        setGenderSpinner();
        setExpertiseSpinner();
        setButtonCliker();


    }

    public void setButtonCliker(){

        quickStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }




    public void setView(){
        genderSpinner = (Spinner) findViewById(R.id.static_spinner);
        levelSpinner = (Spinner)findViewById(R.id.static_spinner_expertise);
        quickStartButton = (Button)findViewById(R.id.quickStartButton);
        nextButton = (Button)findViewById(R.id.infoNextButton);




    }

    public void setGenderSpinner(){
        staticAdapter = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_item);
        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        genderSpinner.setAdapter(staticAdapter);

    }

    public void setExpertiseSpinner(){
        levelAdapter = ArrayAdapter.createFromResource(this, R.array.expertise, android.R.layout.simple_spinner_item);
        levelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        levelSpinner.setAdapter(levelAdapter);

    }

}
