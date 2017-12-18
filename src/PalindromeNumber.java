

public class PalindromeNumber {

    private static final int MAX_POWER_FOR_INT = 10;

    public boolean isPalindrome(int x) {

        int maxPowerOfTen = 0;

        if (x < 0) {
            return false;
        }

        //size of integer
        for (int i = 1; i < MAX_POWER_FOR_INT; i++) {
            if (Math.pow(10, i) <= x) {
                maxPowerOfTen = i;
            }
        }

        for (int i = 0; i < maxPowerOfTen/2+1; i++) {
            if ((int) (x / (Math.pow(10, i)) % 10) != (int) (x / (Math.pow(10,maxPowerOfTen - i)) % 10)) {
                return false;
            }
        }

        return true;
    }

}
