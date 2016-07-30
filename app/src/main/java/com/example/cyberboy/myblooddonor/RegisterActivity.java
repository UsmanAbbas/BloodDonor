package com.example.cyberboy.myblooddonor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {


    EditText etName, etEmail, etContact, etAddress, etCity;
    Button btRegister;

    RadioGroup radioGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etContact = (EditText) findViewById(R.id.etContact);
        etAddress = (EditText) findViewById(R.id.etAddress);
        etCity = (EditText) findViewById(R.id.etCity);
        radioGender = (RadioGroup)findViewById(R.id.radioGender);
        btRegister = (Button) findViewById(R.id.btRegister);

        btRegister.setOnClickListener(this);
        radioGender.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btRegister:

                startActivity(new Intent(this, LoginActivity.class));
                break;

        }
        }


            
    }

