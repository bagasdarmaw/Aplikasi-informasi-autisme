package com.example.doraedan69.informasiautisme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class KarakterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karakter);

        getSupportActionBar().setTitle("Karakteristik Penyandang Autis");
    }
}
