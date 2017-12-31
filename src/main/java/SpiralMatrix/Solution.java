package SpiralMatrix;

//https://leetcode.com/problems/spiral-matrix-ii/description/

public class Solution {

    public int[][] generateMatrix(int n) {

        int xCell = 0;
        int yCell = 0;
        int value = 1;

        int[][] result = new int[n][n];


        if (n == 0) return result;

        result[0][0] = 1;
        if (n == 1) return result;

        result[0][1] = 2;
        result[1][1] = 3;
        result[1][0] = 4;

        if (n == 2) return result;

        result[xCell][yCell] = value;
        value++;

        n--;
        for (int i = 0; i < n; i++) {
            yCell++;
            result[xCell][yCell] = value;
            value++;
        }

        while (true) {
            for (int j = 0; j < n; j++) {
                xCell++;
                result[xCell][yCell] = value;
                value++;
            }
            for (int j = 0; j < n; j++) {
                yCell--;
                result[xCell][yCell] = value;
                value++;
            }
            n--;
            if (n == 0) break;
            for (int j = 0; j < n; j++) {
                xCell--;
                result[xCell][yCell] = value;
                value++;
            }
            for (int j = 0; j < n; j++) {
                yCell++;
                result[xCell][yCell] = value;
                value++;
            }
            n--;
            if (n == 0) break;
        }

        return result;

    }

}
