package com.example.jc.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_one,et_two;
    private TextView tv_res;
    private CheckBox cb_suma,cb_resta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_one = (EditText)findViewById(R.id.et_one);
        et_two = (EditText)findViewById(R.id.et_two);
        tv_res = (TextView) findViewById(R.id.tv_res);
        cb_suma = (CheckBox)findViewById(R.id.cb_suma);
        cb_resta = (CheckBox)findViewById(R.id.cb_resta);
    }
    /**
     * Este método se ejecutará cuando se presione el botón
     * **/
    public void Operar(View v){
        String v1 = et_one.getText().toString();
        String v2 = et_two.getText().toString();
        int n1 = Integer.parseInt(v1);
        int n2 = Integer.parseInt(v2);
        String res = "";
        if(cb_suma.isChecked() == true){
            int suma = n1 + n2;
            res = "La suma es: " + suma;
        }
        else if(cb_resta.isChecked() == true){
            int resta = n1 - n2;
            res =" La resta es: " + resta;
        }
        tv_res.setText(res);

    }
}
