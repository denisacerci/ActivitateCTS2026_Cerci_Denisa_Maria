package main;

import clase.Medic;
import clase.Pacient;
import clase.Salon;

public class Main{
    static void main(String[] args) {
        Pacient pacient1=new Pacient("Nichita",5);
        Medic medic1=new Medic();
        Salon salon1=new Salon();

        if(medic1.areTrimitere(pacient1)){
            int patLiber=salon1.getPatLiber();
            if(patLiber!=-1){
                System.out.println("Pacientul "+pacient1.getNume()+" va fi internat in patul"+""+patLiber);
                salon1.ocupaPat(patLiber);
            }
        }
    }
}
