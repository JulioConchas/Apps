package com.example.jc.waitress;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class LogIn extends FragmentActivity {
    ViewPager view_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Resources res = getResources();

        TabHost tabs = (TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("PERF",res.getDrawable(android.R.drawable.ic_btn_speak_now));
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("MENU",res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("PAGO",res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        //Menu tab
        view_menu = (ViewPager)findViewById(R.id.view_menu);

        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
        view_menu.setAdapter(swipeAdapter);
    }
}
