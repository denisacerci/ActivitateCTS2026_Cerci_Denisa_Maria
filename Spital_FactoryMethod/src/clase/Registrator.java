package clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String functie, int salariu) {
        super(functie, salariu);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Spitalul are ").append(toString());
        System.out.println(sb);
    }
}
