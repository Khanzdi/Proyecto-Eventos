package com.example.personal.info_eventos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.personal.info_eventos.View.LoginActivity;

public class adapter_eventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_eventos);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_cerrarsesion:
                //metodo cerrar sesion
                finish();

                Intent eventos = new Intent(getApplicationContext(), LoginActivity.class);
                eventos.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(eventos);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
