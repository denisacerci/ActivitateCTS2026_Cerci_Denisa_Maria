package acs.cts.main;

import acs.cts.factory.Depou;
import acs.cts.factory.Tipuri;
import acs.cts.simplefactory.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        Depou depou=new Depou();
        MijlocDeTransport autobuz=depou.getMijlocTransport(Tipuri.AUTOBUZ,4,"B12XYZ");
        MijlocDeTransport tramvai=depou.getMijlocTransport(Tipuri.TRAMVAI,12,"B123");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();

    }
}