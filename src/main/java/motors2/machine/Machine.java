package motors2.machine;

import motors2.machine.IMachine;

public abstract class Machine implements IMachine {
    protected String machineType = "Motor";
    protected abstract int getMachineCycles();
}
