import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SplitArrayTest{

    @Test
    public void testThatIhaveAnArrayaAndItSplitsIntoOddAndEven(){

    int [] array = {45, 60, 3, 10, 9, 22};

    int [] [] arrayCheck = {{60, 10, 22},{45, 3, 9}};

    int [] [] actual = SplitArray.arraySplit(array);

    assertArrayEquals(actual,arrayCheck);
      
    }

}
