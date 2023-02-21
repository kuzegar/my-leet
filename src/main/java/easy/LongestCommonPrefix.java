/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
package easy;

class LongestCommonPrefix {


    static String longestCommonPrefix(String[] strs) {
        int leastSize = 200;
        for (String str : strs)
            leastSize=Math.min(leastSize,str.length());

        String common = "";

        for (int i = 0; i < leastSize; i++) {
            boolean areTheSame = true;
            char base = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != base) {
                    areTheSame = false;
                    break;
                }
            }

            if (areTheSame)
                common += base;
             else
                return common;

        }
        return common;
    }
}
