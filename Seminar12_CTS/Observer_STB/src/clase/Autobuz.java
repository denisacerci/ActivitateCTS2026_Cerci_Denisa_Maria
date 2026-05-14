package clase;

public class Autobuz extends MijlocDeTransport{
    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj="Autobuzul de pe linia "+super.linie+" pleaca din depou.";
        notificareCalator(mesaj);
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj="Autobuzul de pe linia "+super.linie+" nu mai circula.";
        notificareCalator(mesaj);
    }
}
