package medium;

import org.junit.jupiter.api.Test;

import static medium.ReverseNumber.reverse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseNumberTest {
    @Test
    void reverseNumberTest() {
        int x, y;

        x = 1534236469;
        y = 0;
        assertEquals(y, reverse(x));

        x = 12345;
        y = 54321;
        assertEquals(y, reverse(x));


        x = -123;
        y = -321;
        assertEquals(y, reverse(x));

        x = 120;
        y = 21;
        assertEquals(y, reverse(x));
    }
}
