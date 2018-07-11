package com.aranirahan.mydagger;

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
