package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int openBrackets = 0;
        int closeBrackets = 0;
        int badOrder = 0;
        char[] arr = str.toCharArray();

//        //catch blank, starts with close, ends with open
//        if (str.length()==0 || arr[0] == ']' || arr[arr.length-1] == '[') {
//            return false;
//        }

        for (char ch : arr) {
            if (ch == '[') {
                openBrackets++;
            } else if (ch == ']') {
                closeBrackets++;
                if (closeBrackets > openBrackets) {
                    badOrder++;
                }
            }
        }
        return (badOrder == 0 && openBrackets>0 && openBrackets == closeBrackets);
    }
}
