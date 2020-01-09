package whenToSell2;

import org.junit.Test;
import whenToSell2.Solution;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProfit() {

        whenToSell2.Solution solution = new whenToSell2.Solution();
        int i = solution.maxProfit(new int[]{7,1,5,3,6,4});
        assertEquals(7, i);
    }

    @Test
    public void maxProfit2() {

        whenToSell2.Solution solution = new whenToSell2.Solution();
        int i = solution.maxProfit(new int[]{1,2,3,4,5});
        assertEquals(4, i);
    }

    @Test
    public void maxProfit3() {

        whenToSell2.Solution solution = new whenToSell2.Solution();
        int i = solution.maxProfit(new int[]{7,6,4,3,1});
        assertEquals(0, i);
    }

}