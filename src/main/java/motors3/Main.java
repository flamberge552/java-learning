package motors3;

abstract class Machine {
    int fuelCapacity = 500;
    int currentFuel;

    abstract void startEngine();

    void fuelUp(int value) {
        if (value + currentFuel > fuelCapacity) {
            throw new RuntimeException("Warning! Amount of fuel to be added exceeds capacity. Got " + value + ", " +
                    "while maximum is " + fuelCapacity);
        }

        currentFuel += value;
    }
}

class Motor extends Machine {
    void startEngine() {
        System.out.println("starting engine...");
    }

    void increaseCapacity() {
        fuelCapacity = fuelCapacity + 50;
    }
}

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        System.out.println("capacity = " + motor.fuelCapacity);
        System.out.println("current = " + motor.currentFuel);

        try {
            motor.fuelUp(250);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            motor.increaseCapacity();
        }

        motor.fuelUp(520);

        System.out.println("capacity = " + motor.fuelCapacity);
        System.out.println("current = " + motor.currentFuel);

        motor.startEngine();
    }
}
