import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NonPerfectSquareArrayTest{

    @Test
    public void testThatIHaveAnArrayAndIReplaceElementsofArrayThatArePerfectSquaresWithMiusOne(){

    int [] array = {4, 7, 9, 10, 49, 6};

    double [] arrayCheck = {4.0,-1.0 ,9.0, -1.0, 49.0, -1.0};

    double [] actual = NonPerfectSquareArray.nonPerfectSquareCheck(array);

    assertArrayEquals(actual,arrayCheck);
    }

}
