package com.example.leena_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class Act2 extends AppCompatActivity {
int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        EditText year=(EditText)findViewById(R.id.editTextNumber);
        EditText name=(EditText)findViewById(R.id.editTextTextPersonName);
        Button bttnsubmit =(Button)findViewById(R.id.bttnSubmit);
        RadioGroup group=(RadioGroup)findViewById(R.id.radiogroup);
        RadioButton male=(RadioButton)findViewById(R.id.radioButton);
        RadioButton female=(RadioButton)findViewById(R.id.radioButton2);
        Button bttnGoX1 =(Button)findViewById(R.id.button2);
        Button bttnGoX3 =(Button)findViewById(R.id.button3);
        Button bttnYear=(Button)findViewById(R.id.button);
        TextView result=(TextView)findViewById(R.id.result) ;
        bttnYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(Act2.this,d,c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        bttnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age=2021-Integer.parseInt(year.getText().toString());
                if(male.isChecked()){
                    result.setText("Hi Mr."+name.getText()+" you are "+age+" years old");
                }

                else
                    result.setText("Hi Mrs."+name.getText()+" you are "+age+" years old");
            }
        });


    }
   TextView tv=(TextView)findViewById(R.id.textView6);
    Calendar c = Calendar.getInstance();
    DateFormat fmtDate=DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            c.set(Calendar.YEAR,year);
            c.set(Calendar.MONTH,month);
            c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
            tv.setText("Your BirthDate "+fmtDate.format(c.getTime()));
}};}