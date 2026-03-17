package ro.acs.cts.builder01.builder01;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setMicDejunInclus(boolean micDejunInclus);
    AbstractBuilder setPapuciDeCamera(boolean papuciDeCamera);
    AbstractBuilder setHalatInclus(boolean halatInclus);
}
