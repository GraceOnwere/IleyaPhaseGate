import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromicArrayTest{

    @Test
    public void testThatIhaveAnArrayAndReturnFalse(){

    int [] array = {45, 0, 8, 0, 1};

    boolean arrayCheck = PalindromicArray.palindromeCheck(array);

    assertFalse(arrayCheck);
      
    }

    @Test
    public void testThatIhaveAnArrayAndReturnTrue(){

    int [] array = {45, 0, 8, 0, 45};

    boolean arrayCheck = PalindromicArray.palindromeCheck(array);

    assertTrue(arrayCheck);
      
    }
    

}
