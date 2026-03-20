package main;

import clase.FelMancare;
import enums.TipDesert;
import enums.TipSupa;
import fabrici.FabricaDesert;
import fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert=new FabricaDesert();
        FabricaSupa fabricaSupa=new FabricaSupa();

        FelMancare supaCiuperci=fabricaSupa.getFelMancare(TipSupa.CIUPERCI,15.5f,300.0f);
        FelMancare supaLegume=fabricaSupa.getFelMancare(TipSupa.LEGUME,25.5f,200.0f);

        FelMancare clatite=fabricaDesert.getFelMancare(TipDesert.CLATITE,30.5f,250f,100.4f);
        FelMancare papanasi=fabricaDesert.getFelMancare(TipDesert.PAPANASI,20.5f,350f,300.4f);

        supaCiuperci.afisare();
        supaLegume.afisare();
        clatite.afisare();
        papanasi.afisare();

    }
}