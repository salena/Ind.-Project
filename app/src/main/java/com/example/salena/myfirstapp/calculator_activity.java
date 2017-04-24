package com.example.salena.myfirstapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class calculator_activity extends AppCompatActivity implements View.OnClickListener {
    TextView input;
    double salary;
    double ira = 5500.0;
    private TextView tv_result;
    double monthly;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_calculator_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView input = (TextView)findViewById(R.id.salaryInput);
        Button button3 = (Button)findViewById(R.id.back);
        Button button4 = (Button)findViewById(R.id.calculate);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        tv_result = (TextView) findViewById(R.id.monthly);
    }

    public void onClick(View v) {
        Intent intent;
        if(v.getId() == R.id.calculate){
            salary = Double.parseDouble(((EditText)findViewById(R.id.salaryInput)).getText().toString());
            System.out.print(salary);
            if(salary >=10000)
                tv_result.setText(String.valueOf((calculate(salary))));


        else System.out.println("You don't make enough to meet this");
        }
        else if(v.getId() == R.id.back) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public double calculate(double salary) { //main calculation algorithm
        double endSalary;

        double taxDeduction = calculateTax(salary);
        endSalary = (salary - ira - taxDeduction - 250);
        monthly = endSalary/12;

        return monthly;
    }

    public double calculateTax(double salary) { //tax bracket calculation
        double tax = 0;
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



