package com.example.salena.myfirstapp;

// Name: Salena Malhotra
// Course: CSC 415
// Semester: Spring 2017
// Instructor: Dr. Pulimood
// Project name: My Rent Calculator
// Description: Based on yearly salary calculates the monthly rent affordance
// Filename: Calculator Activity
// Description: calculates rent
// Last modified on: 4/25/2017


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class calculator_activity extends AppCompatActivity implements View.OnClickListener {
    //TextView input;
   static double salary;
   static double ira = 5500.0;
   public TextView tv_result;
    static double tax = 0;
   static double monthly;




    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_calculator_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView input = (TextView)findViewById(R.id.salaryInput);
        Button button3 = (Button)findViewById(R.id.back); //setting back button
        Button button4 = (Button)findViewById(R.id.calculate); //setting calculate button
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        tv_result = (TextView) findViewById(R.id.monthly);
    }

    public void onClick(View v) {
        Intent intent;
        if(v.getId() == R.id.calculate){
            salary = Double.parseDouble(((EditText)findViewById(R.id.salaryInput)).getText().toString()); //user inputs a salary which gets read into the program
            System.out.print(salary);
            if(salary >=30000)
                tv_result.setText(String.valueOf((calculate(salary)))); //salary calculation begins
            else System.out.println("You don't make enough to meet this"); //error handling - try another number
        }
        else if(v.getId() == R.id.back) { //pressing back button goes back to home page
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public double calculate(double salary) { //main calculation algorithm after all values have been calculated
        double endSalary;

        double taxDeduction = calculateTax(salary); //uses the the salary as a bound for tax deduction
        endSalary = (salary - ira - taxDeduction - 2050);
        monthly = (endSalary/12) - 1750;

        return monthly; //returns the monthly number
    }

    public double calculateTax(double salary) { //tax bracket calculation based on input salary

                if (salary <= 50000) {
                    tax = salary * 0.01;
                } else if (salary <= 75000) {
                    tax = salary * 0.02;
                } else if (salary <= 100000) {
                    tax = salary * 0.03;
                } else if (salary <= 250000) {
                    tax = salary * 0.04;
                } else if (salary <= 500000) {
                    tax = salary * 0.05;
                } else
                    tax = salary * 0.06;
            return tax;
    }

}



