package easy;

import java.util.ArrayList;

 class ValidParentheses {

    static boolean isValid(String s) {
        ArrayList<Character> p = new ArrayList<>();
        p.add('N');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char lastP = p.get(p.size() - 1);
            switch (c) {
                case '(', '[', '{' -> p.add(c);
                case ')' -> {
                    if (lastP == '(')
                        p.remove(p.size() - 1);
                    else
                        return false;

                }
                case ']' -> {
                    if (lastP == '[')
                        p.remove(p.size() - 1);
                    else
                        return false;
                }
                case '}' -> {
                    if (lastP == '{')
                        p.remove(p.size() - 1);
                    else
                        return false;
                }
            }
        }
        return p.size() == 1;
    }

}
