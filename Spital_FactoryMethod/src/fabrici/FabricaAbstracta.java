package fabrici;

import clase.Personal;
import enums.TipPersonal;
import enums.TipPersonalMedical;

public interface FabricaAbstracta {
    public Personal getPersonal(TipPersonal tipPersonal, String functie,int salariu,int tura);
    public Personal getPersonal(TipPersonal tipPersonal, String functie,int salariu);
}
