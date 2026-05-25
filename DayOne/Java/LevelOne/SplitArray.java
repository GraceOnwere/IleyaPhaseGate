import java.util.Arrays;

public class SplitArray{

//    public static void main(String[] args){
//
//    int [] array = {45, 60, 3, 10, 9, 22};
//
//    System.out.println(Arrays.deepToString(arraySplit(array)));
//    }

    public static int [][] arraySplit(int [] array){

    int [][] newArray = new int [2][];

    int evenCount = 0;

    int oddCount = 0;

    for (int arrayIndexCount = 0; arrayIndexCount < array.length; arrayIndexCount++){
    
        if (array[arrayIndexCount] % 2 == 0) evenCount++;

        else oddCount++;

    }

    newArray[0] = new int [evenCount];

    newArray[1] = new int [oddCount];

    int evenCountIndex = 0;

    int oddCountIndex = 0;

    for (int newArrayIndexCount = 0; newArrayIndexCount < array.length; newArrayIndexCount++){

        if (array[newArrayIndexCount] % 2 == 0) newArray[0][evenCountIndex++] = array[newArrayIndexCount];

        else newArray[1][oddCountIndex++] = array[newArrayIndexCount];
 
    }

    return newArray;
    
    }



}
