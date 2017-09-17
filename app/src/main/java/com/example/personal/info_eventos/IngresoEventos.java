package com.example.personal.info_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class IngresoEventos extends AppCompatActivity {

    EditText tex1;
    EditText tex2;
    EditText tex3;
    EditText tex4;
    EditText tex5;
    EditText tex6;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_eventos);

        tex1 = (EditText)findViewById(R.id.NombreEvento);
        tex2 = (EditText)findViewById(R.id.LugarEvento);
        tex3 = (EditText)findViewById(R.id.EncargadoEvento);
        tex4 = (EditText)findViewById(R.id.FechaEvento);
        tex5 = (EditText)findViewById(R.id.DescripcionEvento);
        tex6 = (EditText)findViewById(R.id.RequisitoEvento);
        btn = (Button)findViewById(R.id.BtnGuardar);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String dato1 = tex1.getText().toString();
                String dato2 = tex2.getText().toString();
                String dato3 = tex3.getText().toString();
                String dato4 = tex4.getText().toString();
                String dato5 = tex5.getText().toString();
                String dato6 = tex6.getText().toString();

                ArrayList<String> MisEventos = new ArrayList<>();
                MisEventos.add(dato1);
                MisEventos.add(dato2);
                MisEventos.add(dato3);
                MisEventos.add(dato4);
                MisEventos.add(dato5);
                MisEventos.add(dato6);

                Toast.makeText(getApplicationContext(),"Evento Agregado", Toast.LENGTH_SHORT).show();

                tex1.setText("");
                tex2.setText("");
                tex3.setText("");
                tex4.setText("");
                tex5.setText("");
                tex6.setText("");
            }
        });
    }
}
