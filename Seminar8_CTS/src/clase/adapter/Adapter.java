package clase.adapter;

import clase.spital.Medicament;

public class Adapter extends clase.farmacie.Medicament {
    private Medicament medicament;

    public Adapter(Medicament medicament) {
        super(medicament.getNume());
        this.medicament=medicament;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
