package com.example.apurva.mytesting;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    EditText e1;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editText);

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar ca=Calendar.getInstance();
                datePickerDialog=new DatePickerDialog(MainActivity.this,dateSetListener
                        ,ca.get(Calendar.YEAR),ca.get(Calendar.MONTH),ca.get(Calendar.DAY_OF_MONTH));
                datePickerDialog.setCanceledOnTouchOutside(false);
                datePickerDialog.show();
            }
        });



    }

    DatePickerDialog.OnDateSetListener dateSetListener=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            e1.setText(dayOfMonth+"/"+(month+1)+"/"+year);
        }
    };


}
