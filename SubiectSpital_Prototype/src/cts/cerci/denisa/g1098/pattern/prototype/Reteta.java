package cts.cerci.denisa.g1098.pattern.prototype;

public class Reteta implements RetetaAbstracta{
    private String denumire;
    private int dozaRecomandata;
    private double concentratie;

    public Reteta() {
    }

    public Reteta(String denumire, int dozaRecomandata, double concentratie) {
        if(denumire=="paracetamol"){
            this.denumire=denumire;
        }
        else{
            this.denumire="ibuprofen";
        }

        if(dozaRecomandata>3){
            this.dozaRecomandata=dozaRecomandata;
        }
        else{
            this.dozaRecomandata=2;
        }

        if(concentratie<1.5){
            this.concentratie=concentratie;
        }
        else{
            this.concentratie=3;
        }
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta retetaNoua=new Reteta();
        retetaNoua.denumire=this.denumire;
        retetaNoua.dozaRecomandata=this.dozaRecomandata;
        retetaNoua.concentratie=this.concentratie;
        return retetaNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", dozaRecomandata=").append(dozaRecomandata);
        sb.append(", concentratie=").append(concentratie);
        sb.append('}');
        return sb.toString();
    }

    public void setDozaRecomandata(int dozaRecomandata) {
        if(dozaRecomandata>3){
            this.dozaRecomandata=dozaRecomandata;
        }
        else{
            this.dozaRecomandata=2;
        }

    }
}
