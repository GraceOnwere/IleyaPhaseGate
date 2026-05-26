import java.util.Arrays;

public class PalindromicArray{

    public static boolean palindromeCheck(int [] array){

    int newArray [] = new int [array.length];

    int newArrayCount = 0;

    for (int indexCount = array.length - 1; indexCount >= 0; indexCount--) {

        newArray[newArrayCount] = array[indexCount];

        newArrayCount++;
    }
    return Arrays.equals(array,newArray);
      
    }
}
