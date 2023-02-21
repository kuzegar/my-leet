/**
 * the Fibonacci numbers, commonly denoted Fn , form a sequence, the Fibonacci sequence, in which
 * each number is the sum of the two preceding
 */
package easy;

 class Fibonacci {
     static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }
}
