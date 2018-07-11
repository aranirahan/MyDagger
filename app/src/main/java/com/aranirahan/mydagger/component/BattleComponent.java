package com.aranirahan.mydagger.component;

import com.aranirahan.mydagger.Boltons;
import com.aranirahan.mydagger.module.BraavosModule;
import com.aranirahan.mydagger.module.Cash;
import com.aranirahan.mydagger.module.Soldiers;
import com.aranirahan.mydagger.Starks;
import com.aranirahan.mydagger.War;

import dagger.Component;

@Component(modules = BraavosModule.class)
public interface BattleComponent {
    //Inject
    War getWar();
    Starks getStarks();
    Boltons getBoltons();

    //Module
    Cash getCash();
    Soldiers getSoldiers();
}
