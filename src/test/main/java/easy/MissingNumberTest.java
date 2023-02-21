package easy;

import org.junit.jupiter.api.Test;

import static easy.MissingNumber.missingNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MissingNumberTest {
    @Test
    void missingNumberTest() {
        assertEquals(1, missingNumber(new int[]{0}));
        assertEquals(0, missingNumber(new int[]{1}));
        assertEquals(2, missingNumber(new int[]{0, 1, 3}));
        assertEquals(2, missingNumber(new int[]{3, 0, 1}));
        assertEquals(1, missingNumber(new int[]{0, 2}));
        assertEquals(3, missingNumber(new int[]{0, 1, 2, 4}));
        assertEquals(5, missingNumber(new int[]{0, 1, 2, 3, 4}));
    }
}
