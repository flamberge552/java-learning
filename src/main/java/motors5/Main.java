package motors5;

class Machine {
    int currentFuel;

    void addFuel(int amount) {
        currentFuel += amount;
    }

    void addFuel(int amount1, int amount2) {
        currentFuel += amount1 + amount2;
    }

    void addFuel(int... amount) {
        for (int value : amount) {
            currentFuel += value;
        }
    }

    void addFuel(String amount1, String amount2) {
        currentFuel += Integer.parseInt(amount1) + Integer.parseInt(amount2);
    }
}

public class Main {
    public static void main(String... args) {
        Machine machine = new Machine();
        machine.addFuel(6);
        machine.addFuel(2, 4);
        machine.addFuel(69, 69, 69);
        machine.addFuel("12", "12");

        System.out.println(machine.currentFuel);
    }
}