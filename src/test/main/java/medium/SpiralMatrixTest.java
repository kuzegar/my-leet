package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static medium.SpiralMatrix.spiralOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralMatrixTest {
    @Test
    void spiralMatrixTest() {
        int[][] matrix;
        matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expected = List.of(new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5});
        assertEquals(expected, spiralOrder(matrix));

        matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        expected = List.of(new Integer[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7});
        assertEquals(expected, spiralOrder(matrix));

        matrix = new int[][]{{3}, {2}};
        expected = List.of(new Integer[]{3, 2});
        assertEquals(expected, spiralOrder(matrix));

    }
}
