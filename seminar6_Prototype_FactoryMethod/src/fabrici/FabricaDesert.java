package fabrici;

import clase.Clatite;
import clase.FelMancare;
import clase.Papanasi;
import enums.TipDesert;
import enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return getFelMancare(tipMancare,pret,gramaj);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, float calorii) {
        if(tipMancare== TipDesert.CLATITE){
            return new Clatite(pret,gramaj,calorii);
        }
        else if(tipMancare==TipDesert.PAPANASI){
            return new Papanasi(pret,gramaj,calorii);
        }
        return null;
    }
}
