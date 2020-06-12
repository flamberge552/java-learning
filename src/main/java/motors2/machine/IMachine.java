package motors2.machine;

public interface IMachine {
    int machineCycles = 5;

    void startEngine();
    String getMachineType(ElectroMotor motor);
}
