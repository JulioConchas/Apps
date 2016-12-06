package com.example.jc.waitress;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class terminals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminals);

        //have to validate if this terminal is a client terminal
        SharedPreferences prefe = getSharedPreferences("terminals", Context.MODE_PRIVATE);

        /******* Conectando con fracment ********/
        //Paso 1: Obtener la instancia del administrador de fragmentos
        FragmentManager fragmentManager = getFragmentManager();
        //Paso 2: Creat una nueva transacción
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        switch(prefe.getString("Trade_kind","")){
            case "Waitress":
                System.out.println("**** open waitress's fragment : terminals class **** ");
                waitress waitrFragment = new waitress();
                transaction.add(R.id.terminalsLayout, waitrFragment);
                break;
            case "Kitchen":
                System.out.println("**** open kitchen's fragment : terminals class **** ");
                kitchen kitFragment = new kitchen();
                transaction.add(R.id.terminalsLayout, kitFragment);
                break;
            case "Client":
                System.out.println("**** open client's fragment : terminals class **** ");
                client clFragment = new client();
                transaction.add(R.id.terminalsLayout, clFragment);
                break;
            default:
                System.out.println("**** open as default main's fragment : terminals class **** ");
                Main mainFragment = new Main();
                transaction.add(R.id.terminalsLayout, mainFragment);
                break;
        }
        //4.- Confirmar el cambio
        transaction.commit();
    }
}
