package com.example.salena.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
        Button button3 = (Button) findViewById(R.id.back);
        button3.setOnClickListener(this);
        TextView myTextView = new TextView(this);

    }



    @Override
    protected void onPause() {
        super.onPause();
    }

    public void onClick(View v){ //when the buttons are clicked where does it lead to
        Intent intent;

        if(v.getId() == R.id.back) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}
