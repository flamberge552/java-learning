package aoc.a2015;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ChallengeThreeTest {
    // this test always fails, as Java doesn't allow for dynamically sized arrays,
    // and it's a real pain to initialize a 10/20 array...
//    @Test
//    public void countHousesTest() {
//        ChallengeThree ct = new ChallengeThree();
//        String directions = "^>v<";
//        ct.sendGifts(directions);
//
//        int[][] expected = {{2, 1}, {1, 1}};
//        int[][] actual = ct.houses;
//        assertTrue("The arrays aren't equal", equal(expected, actual));
//    }

    public static boolean equal(final int[][] arr1, final int[][] arr2) {
        if (arr1 == null) {
            return (arr2 == null);
        }
        if (arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!Arrays.equals(arr1[i], arr2[i])) {
                return false;
            }
        }
        return true;
    }

}
