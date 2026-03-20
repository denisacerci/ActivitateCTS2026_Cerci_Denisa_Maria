package fabrici;

import clase.FelMancare;
import enums.TipMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj,float calorii);
}
