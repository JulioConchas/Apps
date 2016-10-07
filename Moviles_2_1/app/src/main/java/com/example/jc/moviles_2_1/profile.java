package com.example.jc.moviles_2_1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class profile extends AppCompatActivity {
    private EditText et_Name,et_Ncontrol,et_phone,et_birth,et_degree,et_score;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        et_Name = (EditText) findViewById(R.id.et_name);
        et_Ncontrol = (EditText) findViewById(R.id.et_n_control);
        et_phone = (EditText) findViewById(R.id.et_phone);
        et_birth = (EditText) findViewById(R.id.et_birth);
        et_degree = (EditText) findViewById(R.id.et_degree);
        et_score = (EditText) findViewById(R.id.et_score);

        consulta();
    }
    public void consulta(){
        DB adminDB = new DB(this,"profile",null,1);
        SQLiteDatabase db = adminDB.getWritableDatabase();
        Cursor dt = db.rawQuery("SELECT * FROM data;",null);
        if(dt.moveToFirst()){
            et_Name.setText(dt.getString(0));
            et_Ncontrol.setText(dt.getString(1));
            et_phone.setText(dt.getString(2));
            et_birth.setText(dt.getString(3));
            et_degree.setText(dt.getString(4));
            et_score.setText(dt.getString(5));
        }
        else Toast.makeText(this,"These is not data!",Toast.LENGTH_SHORT).show();
    }
    public void cur(View view){
        Intent i = new Intent(this,curricula.class);
        startActivity(i);
        Toast.makeText(this,"Curricula",Toast.LENGTH_SHORT).show();
    }
    public void cur_fragmen(View view){
        Intent i = new Intent(this,curricula_fragment.class);
        startActivity(i);
        Toast.makeText(this,"Curricula Fragment",Toast.LENGTH_SHORT).show();
    }
}
