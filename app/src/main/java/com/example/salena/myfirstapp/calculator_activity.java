package com.example.salena.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class calculator_activity extends AppCompatActivity implements View.OnClickListener {
    TextView input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView input = (TextView)findViewById(R.id.salaryInput);


    }

    public void onClick(View v) {
        Intent intent;
        if(v.getId() == R.id.calculate){
            int salary = Integer.parseInt(input.getText().toString());
            if(salary <)
            calculate(Integer.parseInt (s));

        }
        else if(v.getId() == R.id.back) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    private int calculate(int salary) {

    }
}



