package clase;

public interface RezervareAbstractBuilder {
    Rezervare build(String numeClient);
    RezervareAbstractBuilder setAsezareLaGeam(boolean asezareLaGeam);
    RezervareAbstractBuilder setScauneErgonomice(boolean scauneErgonomice);
    RezervareAbstractBuilder setDecorareaMesei(boolean decorareaMesei);
    RezervareAbstractBuilder setMuzicaAmbientala(boolean muzicaAmbientala);
    RezervareAbstractBuilder setGenMuzica(boolean genMuzica);
}
