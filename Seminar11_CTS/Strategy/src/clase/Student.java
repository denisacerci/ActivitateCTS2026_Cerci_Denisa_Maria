package clase;

public class Student {
    private ModSustinere modSustinere;
    private String nume;

    public Student(ModSustinere modSustinere, String nume) {
        this.modSustinere = modSustinere;
        this.nume = nume;
    }

    public Student(String nume) {
        this.nume = nume;
        this.modSustinere=new ProbaGrila();
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
