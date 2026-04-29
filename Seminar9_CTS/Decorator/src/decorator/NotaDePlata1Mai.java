package decorator;

import clase.NotaDePlataAbstracta;

public class NotaDePlata1Mai extends NotaDePlataDecorator{

    public NotaDePlata1Mai(NotaDePlataAbstracta notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("1 Mai fericit!");

    }
}
