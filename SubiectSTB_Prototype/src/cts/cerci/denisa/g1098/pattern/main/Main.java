package cts.cerci.denisa.g1098.pattern.main;

import cts.cerci.denisa.g1098.pattern.prototype.Autobuz;

public class Main{
    static void main(String[] args) {
        Autobuz autobuz1=new Autobuz(40,"roz",60.5);
        Autobuz autobuz2=(Autobuz)autobuz1.clone();

        ((Autobuz)autobuz2).setNrLocuri(50);

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
    }
}