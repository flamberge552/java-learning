package aoc.a2015;

public class ChallengeOne {
    int findFloor(String coords) {
        int floor = 0;
        for (int i = 0; i < coords.length(); i++) {
            if (coords.charAt(i) == '(') {
                floor++;
            } else floor--;
        }
        return floor;
    }

    public static void main(String... args) {
        String coords = "()()()()())))))()()((((()())))()(()()()((()()))()()()()((((()()()";
        ChallengeOne co = new ChallengeOne();
        System.out.println("Santa is on floor number " + co.findFloor(coords));
    }
}
