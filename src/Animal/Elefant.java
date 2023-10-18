package Animal;

public class Elefant extends Erbivor implements Animal{
    @Override
    public void turnOn() {
        System.out.println("Jump");
    }

    @Override
    public void turnOff() {
        System.out.println("Stay");
    }


    @Override
    public Object getWind() {
        return "sud";
    }

    public String disponibil() {
        return "All";
    }
}
