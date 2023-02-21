package easy;

 class Palindrome {
    static boolean isPalindrome(int x) {
        if (x < 0) return false;

        StringBuilder s = new StringBuilder().append(x);
        StringBuilder reverseS = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseS.append(s.charAt(i));
        }
        return reverseS.compareTo(s) == 0;

    }
}
