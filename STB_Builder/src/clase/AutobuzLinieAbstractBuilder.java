package clase;

public interface AutobuzLinieAbstractBuilder {
    AutobuzLinie build(String numeSofer,String modelAutobuz);
    AutobuzLinieAbstractBuilder setAreOprire(boolean areOprire);
    AutobuzLinieAbstractBuilder setDeschideUsa(boolean deschideUsa);
}
