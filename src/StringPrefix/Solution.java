package StringPrefix;

//https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0){
            return "";
        }

        Integer shortestString = Integer.MAX_VALUE;

        for (String str : strs) {
            if (str.length() < shortestString) {
                shortestString = str.length();
            }
        }

        if (shortestString== 0){
            return "";
        }

        int i = 0;
        Character letter;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        do {
            letter = strs[0].charAt(i);
            for (String str : strs) {
                if (!letter.equals(str.charAt(i))) {
                    return sb.toString();
                }
            }
            sb.append(letter);
            i++;
        } while (i < shortestString);

        return sb.toString();

    }
}