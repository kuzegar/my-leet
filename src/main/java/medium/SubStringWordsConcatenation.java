/**
 * You are given a string s and an array of strings words. All the strings of words are of the same length.
 * <p>
 * A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
 * <p>
 * For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated substring because it is not the concatenation of any permutation of words.
 * Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.
 */
package medium;

import java.util.ArrayList;
import java.util.List;

class SubStringWordsConcatenation {
    static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordLength = words[0].length();
        int pace = wordLength * words.length;
        int i = 0;

        while (i + pace <= s.length()) {
            String subS = s.substring(i, i + pace);
            List<String> subList = new ArrayList<>();
            for (int j = 0; j < pace; j += wordLength) {
                subList.add(subS.substring(j, j + wordLength));
            }

            boolean found = true;

            for (String word : words) {
                if (subList.contains(word))
                    subList.remove(word);
                else {
                    found = false;
                    break;
                }
            }
            if (found) {
                result.add(i);
            }
            i++;
        }
        return result;
    }

}
