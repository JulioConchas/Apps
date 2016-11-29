package com.example.jc.sharepreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class sharedTest extends AppCompatActivity {
    private EditText et_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_test);

        et_test = (EditText)findViewById(R.id.et_test);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et_test.setText(prefe.getString("mail",""));
    }
}
