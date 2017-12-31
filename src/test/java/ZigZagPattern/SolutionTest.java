package ZigZagPattern;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SolutionTest {


    @Test
    public void zigZagSolutionFirstLineTest(){

        Solution solution = new Solution();

        String result = solution.convert("PAYPALISHIRING", 3);
        assertThat(result).isEqualTo("PAHN");

    }


    @Test
    public void zigZagSolutionSecondLineTest(){

        Solution solution = new Solution();

        String result = solution.convert("PAYPALISHIRING", 3);
        assertThat(result).isEqualTo("PAHNAPLSIIG");

    }

    @Test
    public void zigZagSolutionTest(){

        Solution solution = new Solution();

        String result = solution.convert("PAYPALISHIRING", 3);
        assertThat(result).isEqualTo("PAHNAPLSIIGYIR");

        String result2 = solution.convert("ABCD", 3);
        assertThat(result2).isEqualTo("ABDC");



    }




}