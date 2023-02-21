package easy;

import org.junit.jupiter.api.Test;

import static easy.Factorial.factorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    @Test
    void factorialTest() {
        assertEquals(1, factorial(1));
        assertEquals(2, factorial(2));
        assertEquals(6, factorial(3));
        assertEquals(24L, factorial(4));
    }
}
