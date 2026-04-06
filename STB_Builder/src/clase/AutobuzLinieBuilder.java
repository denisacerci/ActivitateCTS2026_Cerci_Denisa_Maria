package clase;

public class AutobuzLinieBuilder implements AutobuzLinieAbstractBuilder{
    private String numeSofer;
    private String modelAutobuz;
    private boolean areOprire;
    private boolean deschideUsa;

    public AutobuzLinieBuilder() {
        this.numeSofer = numeSofer;
        this.modelAutobuz = modelAutobuz;
        this.areOprire = areOprire;
        this.deschideUsa = deschideUsa;
    }

    @Override
    public AutobuzLinie build(String numeSofer, String modelAutobuz) {
        return new AutobuzLinie(numeSofer,modelAutobuz,areOprire,deschideUsa);
    }

    @Override
    public AutobuzLinieAbstractBuilder setAreOprire(boolean areOprire) {
        this.areOprire=areOprire;
        return this;
    }

    @Override
    public AutobuzLinieAbstractBuilder setDeschideUsa(boolean deschideUsa) {
        this.deschideUsa=deschideUsa;
        return this;
    }
}
