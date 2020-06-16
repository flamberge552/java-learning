package aoc.a2015;

public class ChallengeSix {
    static boolean[][] lights = new boolean[999][999];

    static void toggle(int startX, int startY, int endX, int endY) {
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                lights[i][j] = !lights[i][j];
            }
        }
    }

    static void turnOn(int startX, int startY, int endX, int endY) {
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                lights[i][j] = true;
            }
        }
    }

    static void turnOff(int startX, int startY, int endX, int endY) {
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                lights[i][j] = false;
            }
        }
    }

    public static void main(String... args) {
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.printf("%s ", lights[i][j]);
            }
            System.out.println();
        }
    }
}
