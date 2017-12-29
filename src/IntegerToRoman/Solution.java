package IntegerToRoman;

class Solution {

    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();
        sb.append(num);
        String liczba = sb.reverse().toString();
        String result = "";

        switch (liczba.length()) {
            case 4: {
                result += tysiace(liczba.substring(3, 4));
            }
            case 3: {
                result += setki(liczba.substring(2, 3));
            }
            case 2: {
                result += dziesiatki(liczba.substring(1, 2));
            }
            case 1: {
                result += jednosci(liczba.substring(0, 1));
            }
        }
        return result;
    }

    private String jednosci(String jednosci) {
        switch (jednosci) {
            case "9": {
                return "IX";
            }
            case "8": {
                return "VIII";
            }
            case "7": {
                return "VII";
            }
            case "6": {
                return "VI";
            }
            case "5": {
                return "V";
            }
            case "4": {
                return "IV";
            }
            case "3": {
                return "III";
            }
            case "2": {
                return "II";
            }
            case "1": {
                return "I";
            }
            default: {
                return "";
            }
        }
    }

    private String dziesiatki(String dziesiatki) {
        switch (dziesiatki) {
            case "9": {
                return "XC";
            }
            case "8": {
                return "LXXX";
            }
            case "7": {
                return "LXX";
            }
            case "6": {
                return "LX";
            }
            case "5": {
                return "L";
            }
            case "4": {
                return "XL";
            }
            case "3": {
                return "XXX";
            }
            case "2": {
                return "XX";
            }
            case "1": {
                return "X";
            }
            default: {
                return "";
            }
        }
    }

    private String setki(String setki) {
        switch (setki) {
            case "9": {
                return "CM";
            }
            case "8": {
                return "DCCC";
            }
            case "7": {
                return "DCC";
            }
            case "6": {
                return "DC";
            }
            case "5": {
                return "D";
            }
            case "4": {
                return "CD";
            }
            case "3": {
                return "CCC";
            }
            case "2": {
                return "CC";
            }
            case "1": {
                return "C";
            }
            default: {
                return "";
            }
        }
    }

    private String tysiace(String tysiace) {
        switch (tysiace) {
            case "3": {
                return "MMM";
            }
            case "2": {
                return "MM";
            }
            case "1": {
                return "M";
            }
            default: {
                return "";
            }
        }
    }

}