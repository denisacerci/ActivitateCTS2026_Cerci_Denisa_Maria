package clase;

public class Medic {
    protected String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void internarePacient(){
        System.out.println("Pacientul "+nume+" a fost internat.");
    }

    public void tratarePacient(){
        System.out.println("Pacientul "+nume+" a fost tratat");
    }

    public void anuleazaInternarePacient(){
        System.out.println("Internarea a fost anulata.");
    }

    public void anuleazaTratarePacient(){
        System.out.println("Tratarea a fost anulata.");
    }

    public void refaceInternarePacient(){
        System.out.println("Internarea a fost reprogramata.");
    }

    public void refaceTratarePacient(){
        System.out.println("Tratarea a fost reprogramata.");
    }
}
