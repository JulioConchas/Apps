package com.example.jc.sharepreference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_email = (EditText)findViewById(R.id.et_email);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et_email.setText(prefe.getString("mail",""));
    }
    public void ejecutar(View v){
        SharedPreferences preferencias = getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("mail",et_email.getText().toString());
        editor.commit();
        finish();
        Intent i = new Intent(this,sharedTest.class);
        startActivity(i);
    }
}
