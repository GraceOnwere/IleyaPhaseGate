import java.util.Arrays;
public class LevelThree{

    public static void main (String [] args){
    
    System.out.println(Arrays.toString(getRotateArray(new int []{1,2,3,4,5},1)));
    }

    public static int [] getFlattenArray(int [][] array){

    int total = 0;

    for (int outerIndex = 0; outerIndex < array.length; outerIndex++){
    
        for (int innerIndex = 0; innerIndex < array[innerIndex].length; innerIndex++){
        
            total += 1;
        }
    }
    
    int [] newArray = new int [total];

    int index = 0;

    for(int[] row : array){
    
        for (int element : row) newArray[index++] = element;  
        }
    return newArray; 
    }

    public static int [] getRotateArray(int [] array, int number){

    int postion = number;

    if (postion == 0) return array;

    else{

    int [] newArray = new int [array.length];

    for (int  newArrayIndex = 0; newArrayIndex < newArray.length; newArrayIndex++){

    newArray[newArrayIndex] = array[array.length - 1];
    
    postion++;

    }
    return newArray;    
        } 
    
    } 
}
