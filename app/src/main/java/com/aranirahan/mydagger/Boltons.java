package com.aranirahan.mydagger;

public class Boltons implements House {
    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName()+ " prepare for war");
    }

    @Override
    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName()+ " reporting...");

    }
}
