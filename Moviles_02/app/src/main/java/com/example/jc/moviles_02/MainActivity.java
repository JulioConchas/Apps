package com.example.jc.moviles_02;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void perfil(View view){
        Intent i = new Intent(this,profile.class);
        startActivity(i);
    }
    public void edit(View view){
        Intent i = new Intent(this,edit.class);
        startActivity(i);
    }

}
