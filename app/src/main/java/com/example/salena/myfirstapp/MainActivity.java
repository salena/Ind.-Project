package com.example.salena.myfirstapp;

// Name: Salena Malhotra
// Course: CSC 415
// Semester: Spring 2017
// Instructor: Dr. Pulimood
// Project name: My Rent Calculator
// Description: Based on yearly salary calculates the monthly rent affordance
// Filename: Main Activity
// Description: runs main method
// Last modified on: 4/25/2017

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
/**
 * The MainActivity of the system represents the starting point for the application.
 * The only information that is made available to the Main Activity is the existence
 *All other information for generating layouts and activities for the rest of the system is generated from the information
 * given in the MainActivity class
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.calculate); //create calculator button
        Button button2 = (Button)findViewById(R.id.apartments); // create apartments button
        Button button3 = (Button)findViewById(R.id.back);
        Button button4 = (Button)findViewById(R.id.breakup);
        button1.setOnClickListener(this); //sets button as onclick
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void onClick(View v){ //when the buttons are clicked where does it lead to
        Intent intent;
        if(v.getId() == R.id.calculate) {
            intent = new Intent(this, calculator_activity.class); // if calculate button is pushed go to calculator page
            startActivity(intent);
        } else if(v.getId() == R.id.apartments) {
            intent = new Intent(this, ApartmentActivity.class); // if apartments button is pushed go to apartments page
            startActivity(intent);
        }

    }
}

