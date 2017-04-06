package com.example.salena.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.calculator);
        Button button2 = (Button)findViewById(R.id.apartments);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void onClick(View v){
        Intent intent;
                if(v.getId() == R.id.calculator) {
                    intent = new Intent(this, calculator_activity.class);
                    startActivity(intent);
                } else if(v.getId() == R.id.apartments) {
                    intent = new Intent(this, ApartmentActivity.class);
                    startActivity(intent);
                }

    }
}

