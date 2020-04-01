package com.example.doraedan69.informasiautisme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //remove
        getSupportActionBar().setTitle(" ");

        ImageView
                pengertian = (ImageView) findViewById(R.id.pengertian);
                pengertian.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent (MenuActivity.this,
                        PengertianActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView
                penyebab = (ImageView) findViewById(R.id.penyebab);
                penyebab.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent (MenuActivity.this,
                        PenyebabActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView
                karakter = (ImageView) findViewById(R.id.karakter);
                karakter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent (MenuActivity.this,
                        KarakterActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView
                terapi = (ImageView) findViewById(R.id.terapi);
        terapi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent (MenuActivity.this,
                        TerapiActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
