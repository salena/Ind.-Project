package com.example.salena.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by Salena on 5/8/2017.
 */

public class calcBreakup_activity extends AppCompatActivity implements View.OnClickListener {
    double breakup = 2050;
    static double salary;
    static double ira = 5500.0;
    public TextView tv_result;
    static double monthly;
    static double tax = 0;
    double retirement = 7501;

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
        /*
        Once the user clicks on this page, the salary breakup will be shown.
        This is done by pulling in the Salary Input from the calculator activity, and
               based on those numbers it calculates the other individual breakups. 
         */
        else {
            salary = Double.parseDouble(((EditText) findViewById(R.id.salaryInput)).getText().toString());
            System.out.print("Your base salary:" + salary);
            tax = Double.parseDouble(((EditText) findViewById(R.id.salaryInput)).getText().toString());
            System.out.print("Your tax bracket:" + tax);
            ira = Double.parseDouble(((EditText) findViewById(R.id.salaryInput)).getText().toString());
            System.out.print("Your IRA:" + ira);
            breakup = Double.parseDouble(((EditText) findViewById(R.id.salaryInput)).getText().toString());
            System.out.print("Your miscellaneous expenses:" + breakup);
            retirement = Double.parseDouble(((EditText) findViewById(R.id.salaryInput)).getText().toString());
            System.out.print("Your miscellaneous expenses:" + retirement);
        }

    }


}
