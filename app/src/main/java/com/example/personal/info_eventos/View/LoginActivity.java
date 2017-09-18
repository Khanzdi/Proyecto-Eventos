package com.example.personal.info_eventos.View;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import com.example.personal.info_eventos.Controller.controlador;
import com.example.personal.info_eventos.R;

public class LoginActivity extends AppCompatActivity  {


    EditText userName;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName=(android.widget.EditText) this.findViewById(R.id.email);
        password=(android.widget.EditText) this.findViewById(R.id.password);
    }

    public void login (View view){
        if (controlador.getSingleton().isValidUser(userName.getText().toString(),password.getText().toString())){
            Intent intent = new Intent(this, LandingActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "El usuario no existe", Toast.LENGTH_SHORT).show();
        }
    }





}

