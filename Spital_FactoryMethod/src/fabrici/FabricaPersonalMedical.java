package fabrici;

import clase.Asistent;
import clase.Medic;
import clase.Personal;
import enums.TipPersonal;
import enums.TipPersonalMedical;

public class FabricaPersonalMedical implements FabricaAbstracta{
    @Override
    public Personal getPersonal(TipPersonal tipPersonal, String functie, int salariu, int tura) {
        if(tipPersonal== TipPersonalMedical.MEDIC){
            return new Medic(functie,salariu,tura);
        }
        else if(tipPersonal==TipPersonalMedical.ASISTENT){
            return new Asistent(functie,salariu,tura);
        }
        return null;
    }

    @Override
    public Personal getPersonal(TipPersonal tipPersonal, String functie, int salariu) {
        return getPersonal(tipPersonal,functie,salariu);
    }
}
