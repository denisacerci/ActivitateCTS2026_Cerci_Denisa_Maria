package clase;

public class RezervareBuilder implements RezervareAbstractBuilder{
    private String nume;
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientala;
    private boolean genMuzica;

    public RezervareBuilder() {
        this.nume = nume;
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient,asezareLaGeam,scauneErgonomice,decorareaMesei,muzicaAmbientala,genMuzica);
    }

    @Override
    public RezervareAbstractBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam=asezareLaGeam;
        return this;
    }

    @Override
    public RezervareAbstractBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice=scauneErgonomice;
        return this;
    }

    @Override
    public RezervareAbstractBuilder setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei=decorareaMesei;
        return this;
    }

    @Override
    public RezervareAbstractBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala=muzicaAmbientala;
        return this;
    }

    @Override
    public RezervareAbstractBuilder setGenMuzica(boolean genMuzica) {
        this.genMuzica=genMuzica;
        return this;
    }
}
