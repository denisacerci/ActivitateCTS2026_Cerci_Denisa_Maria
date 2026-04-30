package clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{

    MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(this.mijlocDeTransport.getTipCursa()==TipCursa.CURSA_SPECIALA){
            System.out.println("Autobuzul este intr-o cursa speciala nu poate opri in statie");
        }
        else{
            this.mijlocDeTransport.opresteInStatie(statie);
        }
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocDeTransport.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocDeTransport.getTipCursa();
    }
}
