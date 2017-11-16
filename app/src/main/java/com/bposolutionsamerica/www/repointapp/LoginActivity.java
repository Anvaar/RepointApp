package com.bposolutionsamerica.www.repointapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText etUsername = (EditText) findViewById(R.id.etUsername);
        EditText etPassword = (EditText) findViewById(R.id.etPassword);
        Button Loginbtn = (Button)findViewById(R.id.btnLogin);
        TextView etRegisterNow = (TextView)findViewById(R.id.etRegisterNow);

        etRegisterNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent RegisterIntent = new Intent(LoginActivity.this,
                     RegisterActivity.class);
             startActivity(RegisterIntent);
            }
        });
        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this,
                        WelcomeActivity.class);
                startActivity(myIntent);
                //your stuff here.
            }
        });





    }





}
