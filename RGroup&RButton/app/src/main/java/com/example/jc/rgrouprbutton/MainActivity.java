package com.example.jc.rgrouprbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_one,et_two;
    private TextView tv_one;
    private RadioButton rb_one,rb_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_one = (EditText)findViewById(R.id.et_one);
        et_two = (EditText)findViewById(R.id.et_dos);
        tv_one = (TextView)findViewById(R.id.tv_one);
        rb_one = (RadioButton)findViewById(R.id.rb_one);
        rb_two = (RadioButton)findViewById(R.id.rb_two);
    }
    /**
     * Este método se ejecutará cuando se presione el botón
     * **/
    public void operar(View v){
        String valor1 = et_one.getText().toString();
        String valor2 = et_two.getText().toString();
        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        if(rb_one.isChecked() == true){
            int suma = n1 + n2;
            String resu = String.valueOf(suma);
            tv_one.setText(resu);
        }
        else if(rb_two.isChecked() == true){
            int resta = n1 - n2;
            String resu = String.valueOf(resta);
            tv_one.setText(resu);
        }
    }
}
