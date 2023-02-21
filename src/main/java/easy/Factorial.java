package easy;

 class Factorial {
     static long factorial(long n) {
        if (n == 1) {
            return 1L;
        } else {
            return n * factorial(n - 1);
        }
    }
}
