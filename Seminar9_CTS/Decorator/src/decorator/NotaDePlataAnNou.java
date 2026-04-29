package decorator;

import clase.NotaDePlataAbstracta;public class NotaDePlataAnNou extends NotaDePlataDecorator{
    public NotaDePlataAnNou(NotaDePlataAbstracta notaDePlata) {
        super(notaDePlata);
    }
    @Override
        public void printeazaFelicitare() {
            System.out.println("An nou fericit!");
    }
}
