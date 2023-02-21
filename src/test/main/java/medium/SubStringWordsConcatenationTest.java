package medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static medium.SubStringWordsConcatenation.findSubstring;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubStringWordsConcatenationTest {

    @Test
    void findSubstringTest() {
        List<Integer> expected = new ArrayList<>();
        expected=List.of(new Integer[]{0,9});
        String s = "barfoothefoobarman";
        String[] words = new String[]{"foo", "bar"};
        assertEquals(expected, findSubstring(s, words));

        expected = new ArrayList<>();
        s = "wordgoodgoodgoodbestword";
        words = new String[]{"word", "good", "best", "word"};
        assertEquals(expected, findSubstring(s, words));

        expected = new ArrayList<>();
        s = "wordgoodgoodgoodbestword";
        expected.add(8);
        words = new String[]{"word", "good", "best", "good"};
        assertEquals(expected, findSubstring(s, words));

        expected = new ArrayList<>();
        s = "ababaab";
        expected.add(1);
        words = new String[]{"ab", "ba", "ba"};
        assertEquals(expected, findSubstring(s, words));
    }
}