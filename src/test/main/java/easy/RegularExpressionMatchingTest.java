package easy;

import org.junit.jupiter.api.Test;

import static easy.RegularExpressionMatching.isMatch;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegularExpressionMatchingTest {
    @Test
    void regularExpressionMatchingTest() {
        String s, p;

        s = "aabcbcbcaccbcaabc";
        p = ".*a*aa*.*b*.c*.*a*";
        assertTrue(isMatch(s, p));

        s = "a";
        p = ".*..a*";
        assertFalse(isMatch(s, p));

        s = "fasdfasdfasdfas";
        p = "f.*asdf.*asdf.*asdf.*s";
        assertTrue(isMatch(s, p));

        s = "ab";
        p = ".*..c*";
        assertTrue(isMatch(s, p));

        s = "bbbba";
        p = ".*a*a";
        assertTrue(isMatch(s, p));

        s = "a";
        p = "ab*a";
        assertFalse(isMatch(s, p));

        s = "aa";
        p = "a";
        assertFalse(isMatch(s, p));

        s = "xyyz";
        p = "xy*.";
        assertTrue(isMatch(s, p));


        s = "aaba";
        p = "ab*a*c*a";
        assertFalse(isMatch(s, p));

        s = "aaa";
        p = "ab*a*c*a";
        assertTrue(isMatch(s, p));

        s = "aaa";
        p = "a*a";
        assertTrue(isMatch(s, p));

        s = "aaa";
        p = "aaaa";
        assertFalse(isMatch(s, p));

        s = "ab";
        p = ".*c";
        assertFalse(isMatch(s, p));

        s = "mississippi";
        p = "mis*is*p*.";
        assertFalse(isMatch(s, p));

        s = "aab";
        p = "c*a*b";
        assertTrue(isMatch(s, p));

        s = "mississippi";
        p = "mis*is*ip*.";
        assertTrue(isMatch(s, p));


        s = "aa";
        p = "a*";
        assertTrue(isMatch(s, p));

        s = "ab";
        p = ".*";
        assertTrue(isMatch(s, p));

        s = "ab";
        p = ".*a";
        assertFalse(isMatch(s, p));
    }
}
