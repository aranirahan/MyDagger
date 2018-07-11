package com.aranirahan.mydagger;

import javax.inject.Inject;

public class War {
    private Starks starks;
    private Boltons boltons;

//    public War(){
//        starks = new Starks();
//        boltons = new Boltons();
//
//        starks.prepareForWar();
//        starks.reportForWar();
//
//        boltons.prepareForWar();
//        boltons.reportForWar();
//    }

    @Inject
    public War(Starks starks, Boltons boltons){
        this.starks = starks;
        this.boltons = boltons;
    }

    public void prepare(){
        starks.prepareForWar();
        boltons.prepareForWar();
    }

    public void report(){
        starks.reportForWar();
        boltons.reportForWar();
    }

}
