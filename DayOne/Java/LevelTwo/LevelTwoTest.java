import org .junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LevelTwoTest{

    @Test
    public void testThatIhaveArrayAndItsReturnsDuplicateElements(){

    int [] array = {1, 2, 3, 2, 4, 3};

    int [] arrayCheck = {2, 3};

    int [] actual = LevelTwo.duplicateCheck(array);

    assertArrayEquals(actual,arrayCheck);
    }

    @Test
    public void testThatIhaveArrayAndItReturnsTheDuplicateElementAndIndex(){

    int [] array = {-11, -9, 3, -9, 2, -11};

    Object [][] arrayCheck = {{-11, new int []{0, 5} }, {-9, new int []{1, 3} }};

    Object [][] actual = LevelTwo.getArrayIndexAndDuplicate(array);

    assertArrayEquals(actual,arrayCheck);
    }

    @Test
    public void testThatIhaveArrayAndIMoveAllZeroElementToTheEndOfTheArray(){
    
    int [] array = {5,0,3,0,2,0};

    int [] arrayCheck = {5,3,2,0,0,0};

    int [] actual = LevelTwo.moveAllZerosIn(array);

    assertArrayEquals(actual,arrayCheck);
    }
}
