package main;

import clase.NotaDePlata;
import clase.NotaDePlataAbstracta;
import decorator.NotaDePlata1Mai;
import decorator.NotaDePlataAnNou;
import decorator.NotaDePlataDecorator;

public class Main {
    static void main(String[] args) {
        NotaDePlataAbstracta notaDePlata=new NotaDePlata(300f,"29.04.2026");
        notaDePlata.printeaza();

        NotaDePlataDecorator notaDePlataDecorator;
        int a=1;
        if(a==1){
            notaDePlataDecorator=new NotaDePlataAnNou(notaDePlata);
        }
        else{
            notaDePlataDecorator=new NotaDePlata1Mai(notaDePlata);
        }


        notaDePlataDecorator.printeaza();

        notaDePlataDecorator.printeazaFelicitare();

    }
}