package main;

import clase.Autobuz;
import clase.Command;
import clase.Operator;
import clase.Plecare;

public class Main{
    static void main(String[] args) {
        Operator operator=new Operator();
        Command comanda1=new Plecare(new Autobuz("Mercedes"),282);
        Command comanda2=new Plecare(new Autobuz("Audi"),381);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new Plecare(new Autobuz("BMW"), 250));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}