package SpiralMatrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void generateMatrix() {

        Solution solution = new Solution();

        int[][] generatedMatrix = solution.generateMatrix(4);
        int[][] correctMatrix = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};

        System.out.println(generatedMatrix);
        System.out.println(correctMatrix);

        int[][] generatedMatrix0 = solution.generateMatrix(0);
        int[][] generatedMatrix1 = solution.generateMatrix(1);
        int[][] generatedMatrix2 = solution.generateMatrix(2);

        assertTrue(generatedMatrix.equals(correctMatrix));


    }
}