package ro.acs.cts.builder01.builder01;

public class InternareBuilder implements AbstractBuilder{
    private Internare internare;

    public InternareBuilder(String numePacient) {
       this.internare=new Internare("George",false,false,false,false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.internare.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.internare.setMicDejunInclus(micDejunInclus);
        return this;
    }

    @Override
    public AbstractBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.internare.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    @Override
    public AbstractBuilder setHalatInclus(boolean halatInclus) {
        this.internare.setHalatInterior(halatInclus);
        return this;
    }
}
