package ZigZagPattern;

class Solution {
    public String convert(String s, int numRows) {

        if (s.length() == 0) return "";
        if (numRows == 1) return s;

        if (numRows == 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += 2) {
                sb.append(s.charAt(i));
            }
            for (int i = 1; i < s.length(); i += 2) {
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }

        StringBuilder sb = new StringBuilder();

        //pierwszy rząd
        int posOfLetter = 0;
        int posOfLetter2 = 0;

        do {
            if (posOfLetter < s.length()) sb.append(s.charAt(posOfLetter));
            posOfLetter += 2 * numRows - 2;
        } while (posOfLetter <= s.length());


        for (int i = 1; i < numRows - 1; i++) {
            posOfLetter = i;
            if (posOfLetter < s.length()) sb.append(s.charAt(posOfLetter));
            do {
                posOfLetter2 = posOfLetter + 2 * numRows - 2 - 2 * i;
                if (posOfLetter2 < s.length()) {
                    sb.append(s.charAt(posOfLetter2));
                }
                posOfLetter += 2 * numRows - 2;
                if (posOfLetter < s.length()) {
                    sb.append(s.charAt(posOfLetter));
                }
            } while (posOfLetter2 <= s.length());
        }

        posOfLetter = numRows - 1;
        do {
            if (posOfLetter < s.length()) sb.append(s.charAt(posOfLetter));
            posOfLetter += 2 * numRows - 2;
        } while (posOfLetter <= s.length());


        return sb.toString();
    }
}

