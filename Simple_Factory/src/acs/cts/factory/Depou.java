package acs.cts.factory;

import acs.cts.simplefactory.clase.Autobuz;
import acs.cts.simplefactory.clase.MijlocDeTransport;
import acs.cts.simplefactory.clase.Tramvai;
import acs.cts.simplefactory.clase.Troleibuz;

public class Depou {
    public MijlocDeTransport getMijlocTransport(Tipuri tip,int numarRoti, String nrInmatriculare){
        if(tip==Tipuri.AUTOBUZ){
            return new Autobuz(numarRoti,nrInmatriculare);
        }
        if(tip==Tipuri.TRAMVAI){
            return new Tramvai(numarRoti,nrInmatriculare);
        }
        if(tip==Tipuri.TROLEIBUZ){
            return new Troleibuz(numarRoti,nrInmatriculare);
        }
        return null;
    }
}
