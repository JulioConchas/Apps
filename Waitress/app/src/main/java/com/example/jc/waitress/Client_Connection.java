package com.example.jc.waitress;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Client_Connection extends AppCompatActivity {
    private Spinner sr_kindTrade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client__connection);

        sr_kindTrade = (Spinner)findViewById(R.id.spinner);
        String []opciones = {"Waitress","Kitchen","Client"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,android.R.layout.simple_spinner_item, opciones);
        sr_kindTrade.setAdapter(adapter);
    }
    public void client_terminals(View view){
        //abrir el fragment dependiento del tipo de cliente
        SharedPreferences preferences = getSharedPreferences("terminals", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Trade_kind",sr_kindTrade.getSelectedItem().toString());
        editor.commit();
        finish();

        Intent i = new Intent(this,terminals.class);
        startActivity(i);
        finish();


    }
}
