import animal3.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzbuzzTest() {
        Main m = new Main();

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                assertEquals("failed. got: " + i + ". want: fizzbuzz", "fizzbuzz", m.fizzbuzz(i));
            } else if (i % 5 == 0) {
                assertEquals("failed. got: " + i + ". want: buzz", "buzz", m.fizzbuzz(i));
            } else if (i % 3 == 0) {
                assertEquals("failed. got: " + i + ". want: fizz", "fizz", m.fizzbuzz(i));
            }
        }
    }
}
