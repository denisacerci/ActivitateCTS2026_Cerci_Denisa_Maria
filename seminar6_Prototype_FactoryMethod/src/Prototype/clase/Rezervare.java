package Prototype.clase;

public class Rezervare implements RezervareAbstracta{
    private String numeClient;
    private int ora;
    private int ziuaRezervarii;
    private String nrTelefon;

    public Rezervare(String numeClient, int ora, int ziuaRezervarii, String nrTelefon) {
        if(numeClient.length()>3){
            this.numeClient=numeClient;
        }
        else{
            this.numeClient="Annie";
        }
        if(ora<23 || ora>9){
            this.ora=ora;
        }
        else{
            this.ora=9;
        }
        if(ziuaRezervarii<31){
            this.ziuaRezervarii=ziuaRezervarii;
        }
        else{
            this.ziuaRezervarii=9;
        }
        if(nrTelefon.length()==10){
            this.nrTelefon=nrTelefon;
        }
        else{
            this.nrTelefon="0771609667";
        }


//        this.numeClient = numeClient;
//        this.ora = ora;
//        this.ziuaRezervarii = ziuaRezervarii;
//        this.nrTelefon = nrTelefon;
    }

    private Rezervare() {

    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua=new Rezervare();
        rezervareNoua.numeClient=this.numeClient;
        rezervareNoua.ora=this.ora;
        rezervareNoua.ziuaRezervarii=this.ziuaRezervarii;
        rezervareNoua.nrTelefon=this.nrTelefon;
        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", ziuaRezervarii=").append(ziuaRezervarii);
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setOra(int ora) {
        if(ora<23 || ora>9){
            this.ora=ora;
        }
        else{
            this.ora=9;
        }

    }

    public void setZiuaRezervarii(int ziuaRezervarii) {
        if(ziuaRezervarii<31){
            this.ziuaRezervarii=ziuaRezervarii;
        }
        else{
            this.ziuaRezervarii=9;
        }
    }
}
