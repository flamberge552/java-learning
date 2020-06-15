package aoc.a2015;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChallengeFourTest {
    @Test
    public void isValidMD5Hash_true() {
        String key = "7834681273648712364jkwhbfgjkdbhfgkjgfdfasgf";
        String expected = "88874931297421f17e95e8d77ec2ea4e";
        String actual = new ChallengeFour().getMD5HashValue(key);

        assertFalse("The hash value empty", actual.isEmpty());
        assertEquals("fail: got: [" + actual + "]. want: [" + expected + "].", expected, actual);
    }

    @Test
    public void isValidMD5Hash_false() {
        String key = "7834681273648712364jkwhbfgjkdbhfgkjgfdfasgf";
        String expected = "888749312974fsdgdsgsdfgdgsdfgsdfgsdfg21f17e95e8d77ec2ea4e";
        String actual = new ChallengeFour().getMD5HashValue(key);

        assertFalse("The hash value empty", actual.isEmpty());
        assertNotSame("fail: got: [" + actual + "]. want: [" + expected + "].", expected, actual);
    }
}
