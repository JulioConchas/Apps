package com.example.jc.waitress;

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

        switch(prefe.getString("Trade_kind","")){
            case "Waitress":
                System.out.println("**** open waitress's fragment : terminals class **** ");
                break;
            case "Kitchen":
                System.out.println("**** open kitchen's fragment : terminals class **** ");
                break;
            case "Client":
                System.out.println("**** open client's fragment : terminals class **** ");
                break;
            default:
                System.out.println("****** Trade king in terminal class : " + prefe.getString("Trade_kind",""));
                break;
        }
    }
}
