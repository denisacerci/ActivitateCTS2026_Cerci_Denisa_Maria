package main;

import clase.*;

public class Main{
    static void main(String[] args) {
        Medic medic=new Medic("Mihai");

        Command comanda1=new ComandaInternare("Maria",medic);
        Command comanda2=new ComandaTratare("Ioana",medic);
        Command comanda3=new ComandaInternare("Elena",medic);

        OperatorDeTriaj operatorDeTriaj=new OperatorDeTriaj();
        operatorDeTriaj.adaugaComanda(comanda1);
        operatorDeTriaj.adaugaComanda(comanda2);
        operatorDeTriaj.adaugaComanda(comanda3);

        operatorDeTriaj.trimiteComanda();
        operatorDeTriaj.trimiteComanda();
        operatorDeTriaj.trimiteComanda();
        operatorDeTriaj.trimiteComanda();


        operatorDeTriaj.anuleazaComanda();
        operatorDeTriaj.anuleazaComanda();
        operatorDeTriaj.anuleazaComanda();
        operatorDeTriaj.anuleazaComanda();

        operatorDeTriaj.refacereComanda();
        operatorDeTriaj.refacereComanda();
    }
}