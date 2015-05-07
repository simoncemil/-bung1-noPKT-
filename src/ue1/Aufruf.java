package ue1;

import Classes.Car;

public class Aufruf {
    public static void main(String[] args) {
        Car bmw = new Car("blau", 4, 150.0);
//        bmw.Farbe = "blau";
//        bmw.Reifen = 4;
//        bmw.Geschwindigkeit = 150.0;
        Car audi = new  Car("silber", 4, 300.0);
//        audi.Farbe = "silber";
//        audi.Reifen = 4;
//        audi.Geschwindigkeit = 300.0;
        
        
        bmw.accelerate();
        audi.accelerate();
    }
}
