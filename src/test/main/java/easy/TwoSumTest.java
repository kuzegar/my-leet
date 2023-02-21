package easy;

import org.junit.jupiter.api.Test;

import static easy.TwoSum.findTwoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    @Test
    void findTwoSumTest() {
        int[] numbs = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, findTwoSum(numbs, target));

        numbs = new int[]{3, 2, 4};
        target = 6;
        assertArrayEquals(new int[]{1, 2}, findTwoSum(numbs, target));

        numbs = new int[]{3, 3};
        target = 6;
        assertArrayEquals(new int[]{0, 1}, findTwoSum(numbs, target));
    }
}