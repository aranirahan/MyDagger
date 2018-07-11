package com.aranirahan.mydagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.aranirahan.mydagger.component.BattleComponent;
import com.aranirahan.mydagger.component.DaggerBattleComponent;
import com.aranirahan.mydagger.module.BraavosModule;
import com.aranirahan.mydagger.module.Cash;
import com.aranirahan.mydagger.module.Soldiers;

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
        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();

        BattleComponent component = DaggerBattleComponent
                .builder().braavosModule(new BraavosModule(cash, soldiers)).build();
        War war = component.getWar();
        war.prepare();
        war.report();

        component.getCash();
        component.getSoldiers();

    }
}
