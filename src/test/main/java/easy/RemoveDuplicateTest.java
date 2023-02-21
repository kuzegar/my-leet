package easy;


import org.junit.jupiter.api.Test;

import static easy.RemoveDuplicates.removeDuplicates;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateTest {
    @Test
    void removeDuplicateTest() {
        int[] numbs;
        numbs = new int[]{1};
        assertEquals(1, removeDuplicates(numbs));

        numbs = new int[]{1, 2, 2, 5, 5, 6, 7};
        assertEquals(5, removeDuplicates(numbs));

        numbs = new int[]{1, 1, 2};
        assertEquals(2, removeDuplicates(numbs));

        numbs = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, removeDuplicates(numbs));
    }

}
