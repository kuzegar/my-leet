package medium;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        List<Integer> spiral = new ArrayList<>();
        int j;
        int i;
        int picked = 101;
        enum Direction {
            Right,
            Down,
            Left,
            Up
        }


        Direction d = Direction.Right;
        spiral.add(matrix[0][0]);
        matrix[0][0] = picked;
        i = 0;
        j = 0;
        while (spiral.size() < (m + 1) * (n + 1)) {
            switch (d) {
                case Right -> {
                    if (i < m) {
                        if (matrix[j][i] != picked) {
                            spiral.add(matrix[j][i]);
                            matrix[j][i] = picked;
                        }
                        if (matrix[j][i + 1] == picked)
                            d = Direction.Down;
                        else
                            i++;
                    } else
                        d = Direction.Down;
                }

                case Down -> {
                    if (j < n) {
                        if (matrix[j][i] != picked) {
                            spiral.add(matrix[j][i]);
                            matrix[j][i] = picked;
                        }
                        if (matrix[j + 1][i] == picked) {
                            d = Direction.Left;
                        } else j++;

                    } else d = Direction.Left;
                }
                case Left -> {
                    if (i > 0) {
                        if (matrix[j][i] != picked) {
                            spiral.add(matrix[j][i]);
                            matrix[j][i] = picked;
                        }
                        if (matrix[j][i - 1] == picked) {
                            d = Direction.Up;
                        } else i--;

                    } else d = Direction.Up;
                }

                case Up -> {
                    if (j > 0) {
                        if (matrix[j][i] != picked) {
                            spiral.add(matrix[j][i]);
                            matrix[j][i] = picked;
                        }
                        if (matrix[j - 1][i] == picked) {
                            d = Direction.Right;
                        } else j--;
                    } else d = Direction.Right;
                }
            }
        }
        return spiral;
    }
}
