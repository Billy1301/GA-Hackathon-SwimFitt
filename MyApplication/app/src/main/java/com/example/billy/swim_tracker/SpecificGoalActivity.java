package com.example.billy.swim_tracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpecificGoalActivity extends AppCompatActivity {

    Spinner stayFitButton;
    Spinner specificButton;
    ArrayAdapter<CharSequence> stayFitAdapter;
    ArrayAdapter<CharSequence> specificGoallAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_goal);

        setView();
        setSpecificGoalAdapter();

    }


    public void setView(){
        stayFitButton = (Spinner) findViewById(R.id.specific_static_spinner);
        specificButton = (Spinner)findViewById(R.id.specific_static_spinner);
    }

    public void setSpecificGoalAdapter(){
        specificGoallAdapter = ArrayAdapter.createFromResource(this, R.array.distance, android.R.layout.simple_spinner_item);
        specificGoallAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        specificButton.setAdapter(specificGoallAdapter);

    }
}
