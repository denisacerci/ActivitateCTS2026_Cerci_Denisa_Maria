package ro.acs.cts.builder01.builder02;

import ro.acs.cts.builder01.builder02.Internare;

public class InternareBuilder02 implements AbstractBuilder02{
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatInterior;

    public InternareBuilder02() {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatInterior = halatInterior;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume,patRabatabil,micDejunInclus,papuciDeCamera,halatInterior);
    }

    @Override
    public AbstractBuilder02 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil=patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus=micDejunInclus;
        return this;
    }

    @Override
    public AbstractBuilder02 setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera=papuciDeCamera;
        return this;
    }

    @Override
    public AbstractBuilder02 setHalatInclus(boolean halatInclus) {
        this.halatInterior=halatInclus;
        return this;
    }
}
