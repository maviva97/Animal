import Animal.*;


public class Main {
    public static void main(String[] args) {
        Animal elefant = new Elefant();
        elefant.turnOff();
        System.out.println(elefant.getTemperature());
        elefant.hardReset();
        System.out.println("-----------------");
        Erbivor elefant1 = new Elefant();
        System.out.println(elefant1.getWind());
        System.out.println(elefant1.disponibil());
    }
}