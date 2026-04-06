package clase;

public class AutobuzLinie {
    private final String numeSofer;
    private final String modelAutobuz;
    private final boolean areOprire;
    private final boolean deschideUsa;

    public AutobuzLinie() {
        numeSofer="Ion";
        modelAutobuz="hibrid";
        areOprire=false;
        deschideUsa=false;
    }

    public AutobuzLinie(String numeSofer, String modelAutobuz, boolean areOprire, boolean deschideUsa) {
        this.numeSofer = numeSofer;
        this.modelAutobuz = modelAutobuz;
        this.areOprire = areOprire;
        this.deschideUsa = deschideUsa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", areOprire=").append(areOprire);
        sb.append(", deschideUsa=").append(deschideUsa);
        sb.append('}');
        return sb.toString();
    }
}

