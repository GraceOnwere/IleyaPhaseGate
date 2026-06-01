import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LevelThreeTest{

    @Test
    public void testThatIhaveA2DArrayAndIFlattenItIntoANewArray(){

    int [][] array = {{9, 0, 7}, {3, 5, 1}, {8, 1, 7}, {9, 9, 6}};

    int [] arrayCheck = {9,0,7,3,5,1,8,1,7,9,9,6};

    int [] actual = LevelThree.getFlattenArray(array);

    assertArrayEquals(actual,arrayCheck);
    }
}
