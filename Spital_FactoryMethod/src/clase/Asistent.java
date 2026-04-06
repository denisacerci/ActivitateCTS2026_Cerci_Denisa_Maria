package clase;

public class Asistent extends PersonalMedical{
    public Asistent(String functie, int salariu, int tura) {
        super(functie, salariu, tura);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Spitalul are ").append(toString());
        System.out.println(sb);
    }
}
