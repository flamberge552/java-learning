package motors4;

class Machine {
    int fuelCapacity = 500;
    int currentFuel;

    void startEngine() {
        System.out.println("starting engine...");
    }

    void fuelUp(int value) {
        if (value + currentFuel > fuelCapacity) {
            throw new RuntimeException("Warning! Amount of fuel to be added exceeds capacity. Got " + value + ", " +
                    "while maximum is " + fuelCapacity);
        }
        currentFuel += value;
    }
}

class Motor extends Machine {
    void revEngine() {
        System.out.println("revving engine...");
    }

    void startEngine() {
        System.out.println("starting MOTOR engine...");
    }
}

class ElectroMotor extends Motor {
    void replaceFuelCells() {
        currentFuel = fuelCapacity;
    }

    void startEngine() {
        System.out.println("starting ELECTROMOTOR engine...");
    }
}

public class Main {
    public static void main(String... args) {
        Machine motor = new ElectroMotor();
        if (ElectroMotor.class.isInstance(motor)) {
            ElectroMotor electroMotor = ElectroMotor.class.cast(motor);
            electroMotor.replaceFuelCells();
        }
        System.out.println(motor.currentFuel);
    }
}
