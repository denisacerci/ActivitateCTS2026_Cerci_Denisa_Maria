package clase;

public class Clatite extends Desert{

    public Clatite(float pret, float gramaj, float caloríi) {
        super(pret, gramaj, caloríi);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Portia de clatite are ").append(super.toString());
        System.out.println(sb);

    }
}
