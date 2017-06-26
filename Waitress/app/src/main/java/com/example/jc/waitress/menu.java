package com.example.jc.waitress;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//Conchas Jimenez Julio Cesar
//conchasjimenez@gmail.com

public class menu extends Fragment {
    TextView textView;

    public menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_menu,container,false);
        textView = (TextView)view.findViewById(R.id.tv_food_desc);
        Bundle bundle = getArguments();
        String menssage = Integer.toString(bundle.getInt("count"));
        textView.setText("Descripcion del platillo " + menssage );
        return view;
    }

}
