package com.example.jc.waitress;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //have to validate if this terminal is a client terminal
        SharedPreferences prefe = getSharedPreferences("terminals", Context.MODE_PRIVATE);

        switch(prefe.getString("Trade_kind","")){
            case "Waitress":
                System.out.println("**** open waitress's fragment : MainActivity class **** ");
                break;
            case "Kitchen":
                System.out.println("**** open kitchen's fragment : MainActivity class **** ");
                break;
            case "Client":
                System.out.println("**** open client's fragment : MainActivity class **** ");
                break;
            default:
                System.out.println("****** Trade king in MainActivity class : " + prefe.getString("Trade_kind",""));
                break;
        }

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
}
