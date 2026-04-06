package main;

import clase.Personal;
import enums.TipPersonalMedical;
import enums.TipPersonalNonMedical;
import fabrici.FabricaPersonalMedical;
import fabrici.FabricaPersonalNonMedical;

public class Main{
    public static void main(String[] args) {
        FabricaPersonalMedical fabricaPersonalMedical=new FabricaPersonalMedical();
        FabricaPersonalNonMedical fabricaPersonalNonMedical=new FabricaPersonalNonMedical();

        Personal medic=fabricaPersonalMedical.getPersonal(TipPersonalMedical.MEDIC,"cardiolog",7000,3);
        Personal asistent=fabricaPersonalMedical.getPersonal(TipPersonalMedical.MEDIC,"neurolog",8000,1);

        Personal secretar=fabricaPersonalNonMedical.getPersonal(TipPersonalNonMedical.SECRETAR,"pediatrie",5600);
        Personal registrator=fabricaPersonalNonMedical.getPersonal(TipPersonalNonMedical.REGISTRATOR,"registratura",9600);

        medic.afisare();
        asistent.afisare();
        secretar.afisare();
        registrator.afisare();



    }
}