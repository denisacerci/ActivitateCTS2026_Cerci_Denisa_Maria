package main;

import clase.*;

public class Main{
    static void main(String[] args) {
        MijlocDeTransport autobuz168=new Autobuz(23,168);
        MijlocDeTransport autobuz226=new Autobuz(0,226);

        Statie statieRomana=new Statie("Piata Romana",10);
        Statie statieUniversitate=new Statie("Universitate",0);

        autobuz168.opresteInStatie(statieRomana);
        autobuz226.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuzNoapte103=new AutobuzNoapte(autobuz168);
        MijlocDeTransport autobuzNoapteN10=new AutobuzNoapte(autobuz226);

        autobuzNoapte103.opresteInStatie(statieRomana);
        autobuzNoapteN10.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuz=new Autobuz(12,6,TipCursa.CURSA_SPECIALA);
        MijlocDeTransport autobuzSpecial=new AutobuzCursaSpeciala(autobuz);
        MijlocDeTransport autobuzSpecial112=new AutobuzCursaSpeciala(autobuz);

        autobuzSpecial112.opresteInStatie(statieRomana);
        autobuzSpecial.opresteInStatie(statieRomana);


    }
}