package motors;

interface MachineCapabilities {
    void fuelUp(int value);
}

interface MotorFunctions {
    void increaseCapacity();
}

// multiple inheritance is allowed for interfaces
interface IMachine extends MotorFunctions, MachineCapabilities{
    void startEngine();
    int getMachineCycles();
}

// here we need to override all the methods in both children and the parent interfaces
class ElectroMotor implements IMachine {
    int engineCapacity = 500;

    public void startEngine() {
        System.out.println("starting engine...");
    }

    public int getMachineCycles() {
        return 1200;
    }

    public void increaseCapacity() {
        engineCapacity++;
    }

    // if we were to say comment out the fuelUp() method, the compilor would throw and error because fuelUp()
    // is supposed to be implemented in the class that implements the child interface of MachineCapabilities
    public void fuelUp(int value) {
        System.out.println("fueling machine with " + value + " units of fuel");
    }

}

public class Main {
    public static void main(String... args) {
        ElectroMotor motor = new ElectroMotor();

        System.out.println(motor.engineCapacity);
        System.out.println(motor.getMachineCycles());

        motor.startEngine();
        motor.fuelUp(motor.engineCapacity);
        motor.increaseCapacity();

        System.out.println(motor.engineCapacity);
    }
}
