package acs.cts.simplefactory.clase;

public class Troleibuz extends MijlocDeTransport{

    public Troleibuz(int numarRoti,String nrInmatriculare){
        super(numarRoti,nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Tramvaiul are: Numar roti: ").append(super.numarRoti);
        sb.append("Numar Inmatriculare ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
