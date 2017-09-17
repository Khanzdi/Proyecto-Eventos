package com.example.personal.info_eventos.View;


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
import com.example.personal.info_eventos.R;
import com.example.personal.info_eventos.adapter_eventos;


public class LoginActivity extends Activity  {
    Button b1,b2;
    EditText ed1,ed2;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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
}

