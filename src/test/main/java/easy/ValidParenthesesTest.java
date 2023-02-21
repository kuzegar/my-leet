package easy;

import org.junit.jupiter.api.Test;

import static easy.ValidParentheses.isValid;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    void isValidTest() {
        String s = "this is (test) against {[parentheses,curly braces and brackets }] [to be truly opened closed ";
        assertFalse(isValid(s));

        s = "this is (test) against {[parentheses,curly braces and brackets ]} [to be truly opened closed] ";
        assertTrue(isValid(s));

        s = "This is (test) against ((((({[parentheses,curly braces and brackets ]}))))) [to be truly opened closed] ";
        assertTrue(isValid(s));

        s = "}";
        assertFalse(isValid(s));

        s = "{";
        assertFalse(isValid(s));

        s = "({})";
        assertTrue(isValid(s));

        s = "";
        assertTrue(isValid(s));
    }

}