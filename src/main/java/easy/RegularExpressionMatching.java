package easy;

 class RegularExpressionMatching {
     static boolean isMatch(String s, String p) {
        if (s.equals(p)) return true;
        //thus they are not the same
        //if p is blank s isn't blank because we checked they aren't same
        if (p.isBlank()) return false;
        //Thus p can't be blank:

        char firstCharP = p.charAt(0);
        if (firstCharP == '*') return false;

        if (p.length() == 1) {
            if (s.isBlank()) return (p.equals("."));

            if (firstCharP == '.' || firstCharP == s.charAt(0))
                return isMatch(s.substring(1), "");
            else //they are not same
                return false;
        }

        //thus p.length >1
        char secondChar = p.charAt(1);


        if (s.isBlank()) {
            if (secondChar == '*')
                return isMatch("", p.substring(2));
            else
                return false;
        }
        //Thus s isn't blank

        //check ending
        char lastS = s.charAt(s.length() - 1);
        char lastP = p.charAt(p.length() - 1);
        if (lastS == lastP || lastP == '.') {
            s = s.substring(0, s.length() - 1);
            p = p.substring(0, p.length() - 1);
            return isMatch(s, p);
        }

        //.* means every character and how many is valid
        if (p.equals(".*")) return true;
        if (p.length() > 2 && p.substring(0, 2).equals(".*")) {
            p = p.substring(2);
            return isMatch(s, p) || isMatch("", p);
        }

        // if the second character of p is * then
        if (secondChar == '*') {
            //if the firstCharP is alphabet and the second is *
            //remove from s and p same alphabets in the start and check isMatch again
            int count = 0;
            if (!s.isBlank()) {
                int i = 0;
                while (i < s.length() && s.charAt(i) == firstCharP) {
                    count = ++i;
                }//count how many firstCharP repeated
            }
            p = p.substring(2);
            return isMatch(s, p) || isMatch(s.substring(count), p);
        } else {//second is not *
            if (firstCharP == '.' || firstCharP == s.charAt(0)) {
                return isMatch(s.substring(1), p.substring(1));// remove form s and p the same alphabets in the start and check isMatch again
            } else {
                return false;
            }
        }
    }
}