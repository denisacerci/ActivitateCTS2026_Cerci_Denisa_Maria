package main;

import clase.Autobuz;
import clase.CalatorAbonat;
import clase.MijlocDeTransport;

public class Main {
    static void main(String[] args) {
        CalatorAbonat calatorAbonat1=new CalatorAbonat("Andrei");
        CalatorAbonat calatorAbonat2=new CalatorAbonat("Nichita");
        CalatorAbonat calatorAbonat3=new CalatorAbonat("Justi");
        CalatorAbonat calatorAbonat4=new CalatorAbonat("Ana");
        CalatorAbonat calatorAbonat5=new CalatorAbonat("Denisa");

        MijlocDeTransport autobuz=new Autobuz("10");
        autobuz.abonareCalator(calatorAbonat1);
        autobuz.abonareCalator(calatorAbonat2);
        autobuz.abonareCalator(calatorAbonat3);

        autobuz.pleacaDinDepou();
        autobuz.abonareCalator(calatorAbonat4);
        autobuz.ramaneBlocatInTrafic();

    }
}

