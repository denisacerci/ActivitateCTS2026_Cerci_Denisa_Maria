package cts.cerci.denisa.g1098.pattern.prototype;

public class Autobuz implements AutobuzAbstract{
    private int nrLocuri;
    private String culoare;
    private double pretBilet;

    public Autobuz() {
    }

    public Autobuz(int nrLocuri, String culoare, double pretBilet) {
        if(nrLocuri>30){
            this.nrLocuri=nrLocuri;
        }
        else{
            this.nrLocuri=18;
        }

        if(culoare.equals("albastru")){
            this.culoare=culoare;
        }
        else{
            this.culoare="negru";
        }

        if(pretBilet==50){
            this.pretBilet=pretBilet;
        }

        else{
            this.pretBilet=20;
        }

    }

    @Override
    public AutobuzAbstract clone() {
        Autobuz autobuzNou=new Autobuz();
        autobuzNou.nrLocuri=this.nrLocuri;
        autobuzNou.culoare=this.culoare;
        autobuzNou.pretBilet=this.pretBilet;
        return autobuzNou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrLocuri=").append(nrLocuri);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", pretBilet=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }

    public void setNrLocuri(int nrLocuri) {
        if(nrLocuri>30){
            this.nrLocuri=nrLocuri;
        }
        else{
            this.nrLocuri=18;
        }
    }
}
