package com.example.billy.swim_tracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class InfoActivity extends AppCompatActivity {

    ArrayAdapter<CharSequence> staticAdapter;
    ArrayAdapter<CharSequence> levelAdapter;
    Spinner genderSpinner;
    Spinner levelSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        setView();
        setGenderSpinner();
        setExpertiseSpinner();

    }


    public void setView(){
        genderSpinner = (Spinner) findViewById(R.id.static_spinner);
        levelSpinner = (Spinner)findViewById(R.id.static_spinner_expertise);


    }

    public void setGenderSpinner(){
        staticAdapter = ArrayAdapter.createFromResource(this, R.array.gender,
                android.R.layout.simple_spinner_item);
        genderSpinner.setAdapter(staticAdapter);

    }

    public void setExpertiseSpinner(){
        levelAdapter = ArrayAdapter.createFromResource(this, R.array.expertise,
                android.R.layout.simple_spinner_item);

        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        levelSpinner.setAdapter(levelAdapter);

    }

}
