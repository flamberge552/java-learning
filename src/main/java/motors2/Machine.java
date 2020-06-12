package motors2;

public abstract class Machine implements IMachine {
    protected String machineType = "Motor";
    protected abstract int getMachineCycles();
}
