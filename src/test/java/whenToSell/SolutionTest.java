package whenToSell;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProfit() {

        Solution solution = new Solution();
        int i = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, i);
    }

    @Test
    public void maxProfit2() {
        Solution solution = new Solution();
        int i = solution.maxProfit(new int[]{7,6,4,3,1});
        assertEquals(0, i);
    }

}