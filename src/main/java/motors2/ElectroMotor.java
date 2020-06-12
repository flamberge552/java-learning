package motors2;


public class ElectroMotor extends Machine {
    String machineType = "Electromotor";

    public int getMachineCycles() {
        return machineCycles;
    }

    public void startEngine() {
        System.out.println("starting engine...");
    }

    public String getMachineType(ElectroMotor motor) {
        return motor.machineType;
    }

    public static void main(String... args) {
        Machine motor = new ElectroMotor();
        System.out.println(motor.getMachineType(new ElectroMotor()));
        motor.startEngine();
    }
}
