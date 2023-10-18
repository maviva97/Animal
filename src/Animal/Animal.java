package Animal;

public interface Animal {
    public abstract void turnOn();

    public abstract void turnOff();

    static double getJumpHeight() {
        return 8;
    }

    public default void hardReset() {
        System.out.println("Hard resetting...");
    }

    public default double getTemperature() {
        return 10.0;
    }

}

