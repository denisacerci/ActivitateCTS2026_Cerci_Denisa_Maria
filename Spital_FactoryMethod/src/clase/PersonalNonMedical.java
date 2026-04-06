package clase;

public abstract class PersonalNonMedical implements Personal {
    protected String functie;
    protected int salariu;

    public PersonalNonMedical(String functie, int salariu) {
        this.functie = functie;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("functie='").append(functie).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
