package motors2;

public interface IMachine {
    int machineCycles = 5;

    void startEngine();
    String getMachineType(ElectroMotor motor);
}
