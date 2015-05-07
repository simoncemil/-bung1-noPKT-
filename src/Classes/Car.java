package Classes;

public class Car {
    public String Farbe;
    public int Reifen;
    public double Geschwindigkeit;
    public double beschleunigen;
    
    public void accelerate(){
        System.out.println("Das Auto hat eine Geschwindigkeit von: " + Geschwindigkeit);
    }
    public Car(String f, int r, double g){//nur public Car() wäre ein leerer Konstruktur, wir haben ihn dann befüllt
        Farbe = f;
        Reifen = r;
        Geschwindigkeit = g;
    }
    public Car(){
        
    }
    public String getFarbe(){
        return(Farbe);
    }
    public int getReifen(){
        return(Reifen);
    }
    public double getGeschwindigkeit(){
        return(Geschwindigkeit);
    }
    public void beschleunigen(double be){
        Geschwindigkeit = Geschwindigkeit + be;
    }
    public void bremsen(double br){
        Geschwindigkeit = Geschwindigkeit - br;
    }
}