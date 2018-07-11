package com.aranirahan.mydagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    Starks starks = new Starks();
    Boltons boltons = new Boltons();
    War war = new War(starks, boltons);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        war.prepare();
        war.report();
    }
}
