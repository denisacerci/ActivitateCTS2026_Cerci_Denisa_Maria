package clase;

public abstract class PersonalMedical implements Personal{
    protected String functie;
    protected int salariu;
    protected int tura;

    public PersonalMedical(String functie, int salariu, int tura) {
        this.functie = functie;
        this.salariu = salariu;
        this.tura = tura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("functie='").append(functie).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append(", tura=").append(tura);
        sb.append('}');
        return sb.toString();
    }
}
