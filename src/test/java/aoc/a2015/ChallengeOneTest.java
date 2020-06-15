package aoc.a2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeOneTest {
    @Test
    public void findFloorTest() {
        int expected = 1;
        int actual = new ChallengeOne().findFloor("()(");
        assertEquals("failed. got " + actual + ". want " + expected, expected, actual);
    }
}
