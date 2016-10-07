package com.example.jc.moviles_2_1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import java.io.IOException;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class edit extends AppCompatActivity {
    private EditText et_Name,et_Ncontrol,et_phone,et_birth,et_degree,et_score;
    private ImageView iv_profile;
    private Intent i;
    final static int cons = 0;
    Bitmap bmp;

    //save picture sd
    private final String ruta_fotos = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/misfotos/";
    private File file = new File(ruta_fotos);
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        et_Name = (EditText) findViewById(R.id.et_name);
        et_Ncontrol = (EditText) findViewById(R.id.et_n_control);
        et_phone = (EditText) findViewById(R.id.et_phone);
        et_birth = (EditText) findViewById(R.id.et_birth);
        et_degree = (EditText) findViewById(R.id.et_degree);
        et_score = (EditText) findViewById(R.id.et_score);

        //Si no existe crea la carpeta donde se guardaran las fotos
        file.mkdirs();
    }
    public void save(View v){
        DB adminDB = new DB(this,"profile",null,1);
        SQLiteDatabase db = adminDB.getWritableDatabase();
        String name = et_Name.getText().toString();
        String NControl = et_Ncontrol.getText().toString();
        String phone = et_phone.getText().toString();
        String birth = et_birth.getText().toString();
        String degree = et_degree.getText().toString();
        String score = et_score.getText().toString();
        ContentValues data =  new ContentValues();
        data.put("name",name);
        data.put("nControl",NControl);
        data.put("phone",phone);
        data.put("birthDate",birth);
        data.put("degree",degree);
        data.put("score",score);
        db.insert("data",null,data);
        db.close();

        et_Name.setText("");
        et_Ncontrol.setText("");
        et_phone.setText("");
        et_birth.setText("");
        et_degree.setText("");
        et_score.setText("");

        Toast.makeText(this,"data succesfully save!",Toast.LENGTH_SHORT).show();
    }
    public void cancel(View v){
        et_Name.setText("");
        et_Ncontrol.setText("");
        et_phone.setText("");
        et_birth.setText("");
        et_degree.setText("");
        et_score.setText("");
    }
    public void photo(View v){

        //save photo
//        String file = ruta_fotos + getCode() + ".jpg";
//        File mi_foto = new File( file );
//
//        try {
//            mi_foto.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Uri uri = Uri.fromFile( mi_foto );



        iv_profile = (ImageView) findViewById(R.id.iv_profile);
        i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
  //      i.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        startActivityForResult(i,cons);
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode == Activity.RESULT_OK){
            Bundle ext = data.getExtras();
            bmp = (Bitmap)ext.get("data");
            iv_profile.setImageBitmap(bmp);
        }
    }
    //Save photo methods
    /**
     60  * Metodo privado que genera un codigo unico segun la hora y fecha del sistema
     61  * @return photoCode
     62  * */
    @SuppressLint("SimpleDateFormat")
    private String getCode(){
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");
         String date = dateFormat.format(new Date() );
         String photoCode = "pic_" + date;
            return photoCode;
    }


}
