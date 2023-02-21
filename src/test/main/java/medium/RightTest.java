package medium;


import org.junit.jupiter.api.Test;

import static medium.ReverseNumber.rightValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RightTest {
    @Test
    void rightValueTest() {
        int x = 12345;
        assertEquals(5, rightValue(x));

        x = 5;
        assertEquals(5, rightValue(x));

        x = 0;
        assertEquals(0, rightValue(x));

    }
}
