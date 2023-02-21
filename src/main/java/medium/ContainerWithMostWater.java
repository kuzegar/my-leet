package medium;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * <p>
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 * <p>
 * Notice that you may not slant the container.
 * Constraints:
 * <p>
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */


class ContainerWithMostWater {
    static int maxArea(int[] height) {
        int max = 0;
        int lastIndex = height.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            if ((height[i] * (lastIndex - i)) < max) continue;

            for (int j = lastIndex; j > i; j--) {
                int h = min(height[i], height[j]);
                int w = j - i;
                max = max(max, h * w);
            }
        }
        return max;
    }
}
