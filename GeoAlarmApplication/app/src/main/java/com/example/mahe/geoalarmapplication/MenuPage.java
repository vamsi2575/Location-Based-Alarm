package com.example.mahe.geoalarmapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuPage extends AppCompatActivity {
ImageButton addgeo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
        addgeo=(ImageButton)findViewById(R.id.addgeo);
        addgeo();
    }
    public  void addgeo()
    {
        addgeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(MenuPage.this,AddGeoAlarm.class);
                startActivity(x);
            }
        });
    }
}
