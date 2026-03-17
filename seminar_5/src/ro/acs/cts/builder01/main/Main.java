package ro.acs.cts.builder01.main;

import ro.acs.cts.builder01.builder01.AbstractBuilder;
import ro.acs.cts.builder01.builder01.Internare;
import ro.acs.cts.builder01.builder01.InternareBuilder;
import ro.acs.cts.builder01.builder02.AbstractBuilder02;
import ro.acs.cts.builder01.builder02.InternareBuilder02;

public class Main {
    public static void main(String[] args) {
        Internare internare1=new Internare();
        internare1.setNumePacient("George");
        internare1.setPatRabatabil(true);
        Internare internare2=new Internare();
        internare2.setNumePacient("Andrei");
        internare2.setPatRabatabil(true);

        AbstractBuilder builder=new InternareBuilder("Georgica");

        Internare internare3=builder.setPatRabatabil(true).build();
        Internare internare4=builder.setPapuciDeCamera(true).setNume("Gigel").build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        AbstractBuilder02 builder2=new InternareBuilder02();
        builder.setMicDejunInclus(true);
        ro.acs.cts.builder01.builder02.Internare internare5=builder2.build("Alin");
        ro.acs.cts.builder01.builder02.Internare internare6=builder2.build("Cristi");

        System.out.println(internare5.toString());
        System.out.println(internare6.toString());

        internare5.setHalatInterior(true);

    }
}