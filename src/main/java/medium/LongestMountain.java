/**
 * You may recall that an array arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.
 */
package medium;


class LongestMountain {
    static int longestMountain(int[] arr) {
        int i = 1;
        int size = arr.length;
        int[] left = new int[size];
        int[] right = new int[size];
        int[] l = new int[size];
        int maxLeng = 0;

        while (i < size - 1) {
            left[i] = leftHillSide(i, arr);
            right[i] = rightHillSide(i, arr);
            if (left[i] > 0 && right[i] > 0) {
                l[i] = left[i] + right[i] + 1;
            }
            maxLeng = Math.max(maxLeng, l[i]);
            i += Math.max(0, right[i]) + 1;
        }

        return maxLeng;
    }

    private static int leftHillSide(int i, int[] arr) {
        int j = i;
        while (j > 0 && arr[j] > arr[j - 1]) {
            j--;
        }
        return i - j;
    }

    private static int rightHillSide(int i, int[] arr) {
        int j = i;
        while (j < arr.length - 1 && arr[j] > arr[j + 1]) {
            j++;
        }
        return j - i;
    }
}
