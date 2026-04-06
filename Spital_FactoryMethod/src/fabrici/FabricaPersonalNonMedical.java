package fabrici;

import clase.*;
import enums.TipPersonal;
import enums.TipPersonalMedical;
import enums.TipPersonalNonMedical;

public class FabricaPersonalNonMedical implements FabricaAbstracta{
    @Override
    public Personal getPersonal(TipPersonal tipPersonal, String functie, int salariu, int tura) {
        return getPersonal(tipPersonal,functie,salariu,tura);
    }

    @Override
    public Personal getPersonal(TipPersonal tipPersonal, String functie, int salariu) {
        if(tipPersonal== TipPersonalNonMedical.SECRETAR){
            return new Secretar(functie,salariu);
        }
        else if(tipPersonal==TipPersonalNonMedical.REGISTRATOR){
            return new Registrator(functie,salariu);
        }
        return null;
    }
}
