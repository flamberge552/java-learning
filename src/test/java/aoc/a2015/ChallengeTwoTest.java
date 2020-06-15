package aoc.a2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTwoTest {
    @Test
    public void findSmallestSideTest_allSidesDifferent() {
        int expected = 6;
        int[] sizes = {4, 3, 2};
        int actual = new ChallengeTwo().findSmallestSide(sizes[0], sizes[1], sizes[2]);
        assertEquals("fail. got " + actual + " . want " + actual, expected, actual);
    }

    @Test
    public void findSmallestSideTest_twoSidesIdentical() {
        int expected = 9;
        int[] sizes = {4, 3, 3};
        int actual = new ChallengeTwo().findSmallestSide(sizes[0], sizes[1], sizes[2]);
        assertEquals("fail. got " + actual + " . want " + actual, expected, actual);
    }

    @Test
    public void findSmallestSideTest_allSidesIdentical() {
        int expected = 9;
        int[] sizes = {3, 3, 3};
        int actual = new ChallengeTwo().findSmallestSide(sizes[0], sizes[1], sizes[2]);
        assertEquals("fail. got " + actual + " . want " + actual, expected, actual);
    }

    @Test
    public void findTotalPaperValueTest() {
        int expected = 58;
        int[] sizes = {4, 3, 2};
        int actual = new ChallengeTwo().findTotalPaperValue(sizes[0], sizes[1], sizes[2]);
        assertEquals("fail. got " + actual + " . want " + actual, expected, actual);
    }
}
