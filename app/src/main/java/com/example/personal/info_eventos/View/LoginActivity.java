package com.example.personal.info_eventos.View;

<<<<<<< HEAD
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
=======

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.personal.info_eventos.IngresoEventos;
>>>>>>> 86d7cd8f3779e9c43873f381ab595b48eb7ea340
import com.example.personal.info_eventos.R;
import com.example.personal.info_eventos.adapter_eventos;

<<<<<<< HEAD
public class LoginActivity extends AppCompatActivity  {


    EditText userName;
    EditText password;
=======

public class LoginActivity extends Activity  {
    Button b1,b2;
    EditText ed1,ed2;
    int counter = 3;
>>>>>>> 86d7cd8f3779e9c43873f381ab595b48eb7ea340

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
<<<<<<< HEAD
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





=======

        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);

        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Bienvenido Administrador",Toast.LENGTH_SHORT).show();
                    Intent ListSong = new Intent(getApplicationContext(), IngresoEventos.class);
                    startActivity(ListSong);
                }else if(ed1.getText().toString().equals("user") &&
                        ed2.getText().toString().equals("user")) {
                    Toast.makeText(getApplicationContext(),
                            "Bienvenido a Eventos",Toast.LENGTH_SHORT).show();
                    Intent ListSong = new Intent(getApplicationContext(), adapter_eventos.class);
                    startActivity(ListSong);
                }else{
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña incorrecta",Toast.LENGTH_SHORT).show();

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
>>>>>>> 86d7cd8f3779e9c43873f381ab595b48eb7ea340
}

