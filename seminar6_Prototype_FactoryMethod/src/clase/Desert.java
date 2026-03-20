package clase;

public abstract class Desert implements FelMancare{
    protected float pret;
    protected float gramaj;
    protected float caloríi;

    public Desert(float pret, float gramaj, float caloríi) {
        this.pret = pret;
        this.gramaj = gramaj;
        this.caloríi = caloríi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", caloríi=").append(caloríi);
        sb.append('}');
        return sb.toString();
    }
}
