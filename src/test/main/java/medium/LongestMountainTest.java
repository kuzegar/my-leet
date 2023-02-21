package medium;

import org.junit.jupiter.api.Test;

import static medium.LongestMountain.longestMountain;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestMountainTest {
    @Test
    void longestMountainTest(){
        int[] arr=new int[] {2,1,4,7,3,2,5};
        assertEquals(5,longestMountain(arr));

        arr=new int[] {2,2,2};
        assertEquals(0,longestMountain(arr));
    }
}
