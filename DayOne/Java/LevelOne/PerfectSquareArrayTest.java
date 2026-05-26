import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectSquareArrayTest{

    @Test
    public void testThatIHaveAnArrayAndIgetElementsofArrayThatArePerfectSquares(){

    int [] array = {4, 7, 9, 10, 16, 18};

    double [] arrayCheck = {4.0,9.0,16.0};

    double [] actual = PerfectSquareArray.perfectSquareCheck(array);

    assertArrayEquals(actual,arrayCheck);
    }

}
