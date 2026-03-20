package clase;

public class Papanasi extends Desert{

    public Papanasi(float pret, float gramaj, float caloríi) {
        super(pret, gramaj, caloríi);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Portia de papanasi are ").append(super.toString());
        System.out.println(sb);
    }
}
