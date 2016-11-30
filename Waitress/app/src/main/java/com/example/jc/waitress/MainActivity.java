package com.example.jc.waitress;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Main.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SharedPreferences prefe = getSharedPreferences("terminals", Context.MODE_PRIVATE);          //opteniento tipo de terminal

        /******* Conectando con fracment ********/
        //Paso 1: Obtener la instancia del administrador de fragmentos
        FragmentManager fragmentManager = getFragmentManager();
        //Paso 2: Creat una nueva transacción
        FragmentTransaction transaction = fragmentManager.beginTransaction();


        switch(prefe.getString("Trade_kind","")){
            case "Waitress":
                System.out.println("**** open waitress's fragment : MainActivity class **** ");
                waitress waitrFragment = new waitress();
                transaction.add(R.id.mainLayout, waitrFragment);
                break;
            case "Kitchen":
                System.out.println("**** open kitchen's fragment : MainActivity class **** ");
                kitchen kitFragment = new kitchen();
                transaction.add(R.id.mainLayout, kitFragment);
                break;
            case "Client":
                System.out.println("**** open client's fragment : MainActivity class **** ");
                client clFragment = new client();
                transaction.add(R.id.mainLayout, clFragment);
                break;
            default:
                System.out.println("**** open as default main's fragment : MainActivity class **** ");
                Main mainFragment = new Main();
                transaction.add(R.id.mainLayout, mainFragment);
                break;
        }
        //4.- Confirmar el cambio
        transaction.commit();

    }
    public void singUp(View view){
        Intent i = new Intent(this,SingUp.class);
        startActivity(i);
    }
    public void logIn(View view){
        Intent i = new Intent(this,LogIn.class);
        startActivity(i);
    }
    public void client_connection(View view){
        Intent i = new Intent(this,Client_Connection.class);
        startActivity(i);
        finish();
    }
    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }
}
