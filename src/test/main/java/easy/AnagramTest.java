package easy;

import org.junit.jupiter.api.Test;

import static easy.Anagram.isAnagram;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {
    @Test
    void anagram_test() {
        assertTrue(isAnagram("anagram", "mgarana"));
        assertFalse(isAnagram("rat", "car"));
        assertFalse(isAnagram("a", "ab"));
    }
}


