package com.example.salena.myfirstapp;

// Name: Salena Malhotra
// Course: CSC 415
// Semester: Spring 2017
// Instructor: Dr. Pulimood
// Project name: My Rent Calculator
// Description: Based on yearly salary calculates the monthly rent affordance
// Filename: apartment Activity
// Description: links to apartment website
// Last modified on: 4/25/2017


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.net.Uri;
import android.widget.ImageView;



/**
 * Created by Salena on 4/21/2017.
 */



public class ApartmentActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button button3 = (Button) findViewById(R.id.back); //set back button
        button3.setOnClickListener(this);
        TextView myTextView = new TextView(this);
        Button button4 = (Button)findViewById(R.id.apartmentView); //setting apartment button to lead to website link
        button4.setOnClickListener(this);

    }



    @Override
    protected void onPause() {
        super.onPause();
    }

    public void onClick(View v){ //when the buttons are clicked where does it lead to
        Intent intent;

        if(v.getId() == R.id.back) { //clicking home button goes to homepage
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.apartmentView) { // clicking the apartments button redirects to external website
            //Uri uri = Uri.parse("http://www.apartments.com");
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apartments.com")); // Create a new intent - stating you want to 'view something'
                startActivity(i); //leads to the apartments webpage
            }

        }




    }





