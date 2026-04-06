package main;

import clase.Rezervare;
import clase.RezervareAbstractBuilder;
import clase.RezervareBuilder;

public class Main{
    public static void main(String[] args) {

        RezervareAbstractBuilder builder1=new RezervareBuilder();
        builder1.setAsezareLaGeam(true);

        Rezervare rezervare2=builder1.build("Dennie");
        Rezervare rezervare3=builder1.build("Tataru");

        rezervare2.setDecorareaMesei(true);

        System.out.println(rezervare2.toString());
        System.out.println(rezervare3.toString());





    }

}
