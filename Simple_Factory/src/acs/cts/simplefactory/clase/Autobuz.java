package acs.cts.simplefactory.clase;

public class Autobuz extends MijlocDeTransport {
    public Autobuz(int numarRoti,String nrInmatriculare){
        super(numarRoti,nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Autobuzul are: Numar roti: ").append(super.numarRoti);
        sb.append("Numar Inmatriculare ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
