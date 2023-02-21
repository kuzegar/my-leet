package easy;

import org.junit.jupiter.api.Test;

import static easy.Fibonacci.fib;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FibonacciTest {
    @Test
    void fibonacciTest() {
        assertEquals(1, fib(1));
        assertEquals(1, fib(2));
        assertEquals(2, fib(3));
        assertEquals(3, fib(4));
        assertEquals(5, fib(5));
        assertEquals(8, fib(6));
        assertEquals(13, fib(7));

    }
}
