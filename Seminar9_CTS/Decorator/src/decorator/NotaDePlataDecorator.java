package decorator;

import clase.NotaDePlataAbstracta;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstracta {
    private NotaDePlataAbstracta notaDePlata;
    public NotaDePlataDecorator(NotaDePlataAbstracta notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }

    public abstract void printeazaFelicitare();
}
