package com.example.labo03_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

import com.example.labo03_pdm.utils.AppConstants;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText editT_username, editT_password,editT_email, editT_gender;
    Button btn_send;
    private static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editT_username= findViewById(R.id.Et_username);
        editT_password = findViewById(R.id.Et_password);
        editT_email = findViewById(R.id.Et_email);
        editT_gender = findViewById(R.id.Et_gender);
        btn_send = findViewById(R.id.btn_send);


        btn_send.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this, actividad2.class);
            mIntent.putExtra(AppConstants.TEXT_KEY,editT_username.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_PASS,editT_password.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_EMAIL,editT_email.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_GENDER,editT_gender.getText().toString());
            startActivity(mIntent);
        });

    }
}
