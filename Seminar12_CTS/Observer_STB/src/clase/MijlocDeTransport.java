package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    private List<Calator> listaCalatori;
    String linie;

    public MijlocDeTransport(String linie) {
        this.linie =linie ;
        listaCalatori=new ArrayList<>();
    }
    public void abonareCalator(Calator calator){
        listaCalatori.add(calator);
    }

    public void dezabonareCalator(Calator calator){
        listaCalatori.remove(calator);
    }

    public void notificareCalator(String mesaj){
        for(Calator calator:this.listaCalatori){
            calator.notificare(mesaj);
        }
    }

    public abstract void pleacaDinDepou();
    public abstract void ramaneBlocatInTrafic();
}
