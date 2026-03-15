package acs.cts.simplefactory.clase;

public abstract class MijlocDeTransport {
    protected int numarRoti;
    protected String nrInmatriculare;

    public MijlocDeTransport(int numarRoti, String nrInmatriculare) {
        this.numarRoti = numarRoti;
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract void afiseazaDescriere();
}
