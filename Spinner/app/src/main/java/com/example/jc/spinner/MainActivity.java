package com.example.jc.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private EditText et_one,et_two;
    private TextView tv_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_one = (EditText)findViewById(R.id.et_one);
        et_two = (EditText)findViewById(R.id.et_two);
        tv_one = (TextView)findViewById(R.id.tv_one);

        spinner1 = (Spinner)findViewById(R.id.spinner);
        String []options = {"sumar","restar","multiplicar","dividir"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,options);
        spinner1.setAdapter(adapter);
    }
    /**
     * This method will work when the button being clicked
     * **/
    public void operar(View v){
        String v1 = et_one.getText().toString();
        String v2 = et_two.getText().toString();
        int n1 = Integer.parseInt(v1);
        int n2 = Integer.parseInt(v2);
        String selec = spinner1.getSelectedItem().toString();
        if(selec.equals("sumar")){
            int suma = n1 + n2;
            String res = String.valueOf(suma);
            tv_one.setText(res);
        }
        else if(selec.equals("restar")){
            int rest = n1 - n2;
            String res = String.valueOf(rest);
            tv_one.setText(res);
        }
        else if(selec.equals("multiplicar")){
            int mult = n1 * n2;
            String mt = String.valueOf(mult);
            tv_one.setText(mt);
        }
        else{
            float div = n1 / n2;
            String dv = String.valueOf(div);
            tv_one.setText(dv);
        }
    }
}
