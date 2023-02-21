/**
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically
 * using all the original letters exactly once. For example, the word anagram itself can be rearranged into
 * nag a ram, as well as the word binary into brainy and the word adobe into abode.
 */
package easy;

class Anagram {
    static boolean isAnagram(String s, String t) {
        char c;
        while (!s.equals("")) {
            c = s.charAt(0);
            if (t.indexOf(c) == -1) {
                return false;
            } else {
                s = s.substring(1);
                t = t.substring(0, t.indexOf(c)) + t.substring(t.indexOf(c) + 1);
            }
        }
        return t.isEmpty();
    }
}
