package ro.acs.cts.builder01.builder02;

import ro.acs.cts.builder01.builder02.Internare;

public interface AbstractBuilder02 {
    Internare build(String nume);
    AbstractBuilder02 setPatRabatabil(boolean patRabatabil);
    AbstractBuilder02 setMicDejunInclus(boolean micDejunInclus);
    AbstractBuilder02 setPapuciDeCamera(boolean papuciDeCamera);
    AbstractBuilder02 setHalatInclus(boolean halatInclus);
}
