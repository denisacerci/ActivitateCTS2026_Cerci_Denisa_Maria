package Prototype.main;

import Prototype.clase.Rezervare;
import Prototype.clase.RezervareAbstracta;

public class Main {
    static void main(String[] args) {
        Rezervare rezervare1=new Rezervare("Dennie",21,20,"0776097556");
        Rezervare rezervare2=(Rezervare)rezervare1.clone();

        ((Rezervare)rezervare2).setOra(10);
        ((Rezervare)rezervare2).setZiuaRezervarii(10);

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

    }
}
