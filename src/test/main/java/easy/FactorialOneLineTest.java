package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialOneLineTest {
    @Test
    void factorialOneLineTest() {
        assertEquals(120, new FactorialOneLine().calculate.apply(5));
        assertEquals(24, new FactorialOneLine().calculate.apply(4));
    }
}
