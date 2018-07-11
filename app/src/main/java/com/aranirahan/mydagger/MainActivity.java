package com.aranirahan.mydagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Starks starks = new Starks();
//        Boltons boltons = new Boltons();
//        War war = new War(starks, boltons);
//        setContentView(R.layout.activity_main);
//        war.prepare();
//        war.report();

        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();

    }
}
