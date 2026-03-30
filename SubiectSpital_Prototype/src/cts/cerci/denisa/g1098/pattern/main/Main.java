package cts.cerci.denisa.g1098.pattern.main;

import cts.cerci.denisa.g1098.pattern.prototype.Reteta;

public class Main{
    static void main(String[] args) {
        Reteta reteta1=new Reteta("advil",4,3.2);
        Reteta reteta2=(Reteta)reteta1.clone();

        ((Reteta)reteta1).setDozaRecomandata(5);

        System.out.println(reteta1);
        System.out.println(reteta2);

    }
}
