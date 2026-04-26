package main;

import clase.spital.Medicament;



public class Main{
    public static void procurareMedicament(clase.farmacie.Medicament medicamentF){
        medicamentF.cumparaMedicament();
    }
    static void main(String[] args) {



        Medicament paracetamol=new Medicament("Paracetamol",15.50f);
        clase.farmacie.Medicament nospa=new clase.farmacie.Medicament("Nospa");

        paracetamol.prezintaReteta();
        paracetamol.achizitioneazaMedicament();
        nospa.cumparaMedicament();

        Adapter adapterMedicamente = new AdapterMedicamente(medicament);
        adapterMedicamente.cumparaMedicament();
        //procurareMedicament(paracetamol);
        procurareMedicament(nospa);



    }
}