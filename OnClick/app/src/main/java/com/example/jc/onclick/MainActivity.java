package com.example.jc.onclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_1,et_2;
    private TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_1 = (EditText)findViewById(R.id.et_1);
        et_2 = (EditText)findViewById(R.id.et_2);
        tv_1 = (TextView)findViewById(R.id.tv_3);
    }
    /**
     * Este método se ejecutará cuando se presione el botón
     * **/
    public void suma(View v){
        String valor_1 = et_1.getText().toString();
        String valor_2 = et_2.getText().toString();
        int n_1 = Integer.parseInt(valor_1);
        int n_2 = Integer.parseInt(valor_2);
        int suma = n_1 + n_2;
        String res = String.valueOf(suma);
        tv_1.setText(res);
    }
}
