package com.example.jc.waitress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SingUp extends AppCompatActivity {
    private EditText et_TradeName,et_adminName,et_pass,et_cPass,et_email;
    private Spinner sr_kindTrade;
    private CheckBox TandC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        et_TradeName = (EditText)findViewById(R.id.et_TradeName);
        et_adminName = (EditText)findViewById(R.id.et_adminName);
        et_pass = (EditText)findViewById(R.id.et_pass);
        et_cPass = (EditText)findViewById(R.id.et_cPass);
        et_email = (EditText)findViewById(R.id.et_email);

        sr_kindTrade = (Spinner)findViewById(R.id.spinner);
        String []opciones = {"Bar","Restaurant","Coffer Shop","Bar-Restaurant"};
        ArrayAdapter <String>adapter = new ArrayAdapter<String> (this,android.R.layout.simple_spinner_item, opciones);
        sr_kindTrade.setAdapter(adapter);

        TandC = (CheckBox)findViewById(R.id.cb_conditions);
    }
    public void showData(View v){
        if(TandC.isChecked() == true){
            System.out.println("************** Data ************************");
            System.out.println("Trade name: " + et_TradeName.getText().toString());
            System.out.println("Kind of trade: " + sr_kindTrade.getSelectedItem().toString());
            System.out.println("Admin name: " + et_adminName.getText().toString());
            System.out.println("Password: " + et_pass.getText().toString());
            System.out.println("Confirm pass: " + et_cPass.getText().toString());
            System.out.println("Email: " + et_email.getText().toString());
            System.out.println("*********************************************");
        }
        else Toast.makeText(this,"have to check Terms & Conditions",Toast.LENGTH_LONG).show();

    }
}
