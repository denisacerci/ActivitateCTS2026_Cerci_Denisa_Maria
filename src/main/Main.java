package main;

import acs.cts.singleton.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Intercontinental",7,5);
        Hotel hotel2=Hotel.getInstance("Grandhotel",200,0);

        hotel1.rezervaCamera(2);
        hotel2.rezervaCamera(2);


        }
    }
