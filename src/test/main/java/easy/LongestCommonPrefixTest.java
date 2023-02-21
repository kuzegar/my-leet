package easy;

import org.junit.jupiter.api.Test;

import static easy.LongestCommonPrefix.longestCommonPrefix;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {
    @Test
    void longestCommonPrefixTest() {
        String[] strings = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix(strings));

        strings = new String[]{"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix(strings));

        strings = new String[]{"", "b"};
        assertEquals("", longestCommonPrefix(strings));

        strings = new String[]{"flower", "flower", "flower", "flower"};
        assertEquals("flower", longestCommonPrefix(strings));
    }

}