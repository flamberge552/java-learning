package animal3;

public class Main {
    public String fizzbuzz(int i) {
        String output = "";
        output = "";
        output += (i % 3) == 0 ? "fizz" : "";
        output += (i % 5) == 0 ? "buzz" : "";
        return !output.isEmpty() ? output : String.valueOf(i);
    }

    public static void main(String... args) {
        Main m = new Main();
        for (int i = 1; i <= 100; i++) {
            System.out.println(m.fizzbuzz(i));
        }
    }
}
