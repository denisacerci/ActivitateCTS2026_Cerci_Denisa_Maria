package clase;

public class Sectie implements Structura{
    private String nume;
    private int nrAngajati;

    public Sectie(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume Sectie: " + nume+" Nr angajati: "+nrAngajati);
    }
}
