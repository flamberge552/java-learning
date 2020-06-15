package aoc.a2015;

public class ChallengeTwo {
    int findSmallestSide(int l, int w, int h) {
        int[] sizes = {l, w, h};
        int first, second;

        first = second = Integer.MAX_VALUE;

        for (int size : sizes) {
            if (size <= first) {
                second = first;
                first = size;
            }
        }

        return first * second;
    }

    int findTotalPaperValue(int l, int w, int h) {
        return 2*l*w + 2*l*h + 2*w*h + findSmallestSide(l, w, h);
    }

    public static void main(String... args) {
        ChallengeTwo ct = new ChallengeTwo();
        System.out.println("The total amount of wrapping paper needed is " + ct.findTotalPaperValue(4, 3 ,2) + " square feet.");
    }
}
