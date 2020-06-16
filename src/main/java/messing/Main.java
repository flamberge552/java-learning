package messing;

public class Main {

    String transform(String input) {
        input = input.toLowerCase();
        return input.replace("-", "_");
    }

    public static void main(String... args) {
        String input = "this-iS-MY-TexT";
        Main m = new Main();
        String newString = m.transform(input);
        System.out.println(newString);
    }
}
