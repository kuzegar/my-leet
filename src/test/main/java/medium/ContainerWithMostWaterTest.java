package medium;

import org.junit.jupiter.api.Test;

import static medium.ContainerWithMostWater.maxArea;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    @Test
    void maxArea_Test() {

        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, maxArea(height));

        height = new int[]{1, 1};
        assertEquals(1, maxArea(height));

        height = new int[]{2, 3, 4, 5, 18, 17, 6};
        assertEquals(17, maxArea(height));
    }
}