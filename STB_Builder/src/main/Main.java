package main;

import clase.AutobuzLinie;
import clase.AutobuzLinieAbstractBuilder;
import clase.AutobuzLinieBuilder;

public class Main{
    public static void main(String[] args) {
        AutobuzLinieAbstractBuilder builder1=new AutobuzLinieBuilder();
        builder1.setAreOprire(true);
        AutobuzLinie autobuzLinie1=builder1.build("Ionut","electric");
        AutobuzLinie autobuzLinie2=builder1.setDeschideUsa(true).build("Andrei","manual");

        System.out.println(autobuzLinie2.toString());
        System.out.println(autobuzLinie1.toString());

    }
}