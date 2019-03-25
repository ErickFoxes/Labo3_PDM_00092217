package com.example.labo03_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo03_pdm.utils.AppConstants;

public class actividad2 extends AppCompatActivity {
    TextView txt_user,txt_pass,txt_mail,txt_gen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        txt_user = findViewById(R.id.txt_username);
        txt_pass = findViewById(R.id.txt_password);
        txt_mail = findViewById(R.id.txt_email);
        txt_gen = findViewById(R.id.txt_gender);
        Intent mIntent = getIntent();
        if (mIntent !=null){
        txt_user.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        txt_pass.setText(mIntent.getStringExtra(AppConstants.TEXT_PASS));
        txt_mail.setText(mIntent.getStringExtra(AppConstants.TEXT_EMAIL));
        txt_gen.setText(mIntent.getStringExtra(AppConstants.TEXT_GENDER));
        }
    }
}
