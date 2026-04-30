package main;

import clase.Autobuz;
import clase.ManagerLinie;

public class Main{
    static void main(String[] args) {

        Autobuz autobuz101=new Autobuz("Mercedes",1999,50);
        Autobuz autobuz102=new Autobuz("Lada",1998,100);
        Autobuz autobuz103=new Autobuz("Lamborghini",1997,60);

        ManagerLinie managerLinie=new ManagerLinie();
        managerLinie.getLinie(101,"Romana","Universitate").numarMaximPasageriPeLinie(autobuz101);
        managerLinie.getLinie(101,"Otopeni","Constitutiei").descriereLinie(autobuz101);


    }
}