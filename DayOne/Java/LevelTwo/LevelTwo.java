public class LevelTwo{

    public static int getDuplicateCount(int [] array){

        int count = 0;
    for (int outerIndexCount = 0; outerIndexCount < array.length; outerIndexCount++){

        for (int innerIndexCount = outerIndexCount + 1 ; innerIndexCount < array.length; innerIndexCount++){

        if (array[outerIndexCount] == array[innerIndexCount]) {
            
            count++;

            break;
            }

        }
    }

    return count;

    }
    
    public static int [] duplicateCheck(int [] array){

    int count = getDuplicateCount(array);

    int [] newArray = new int [count];

    int counter = 0;
    for (int outerIndex = 0; outerIndex < array.length; outerIndex++){

        for (int innerIndex = outerIndex + 1; innerIndex < array.length; innerIndex++){

        if (array[outerIndex] == array[innerIndex]) {

        newArray[counter++] = array[outerIndex];
        break;
        }
        }
    }  
    return newArray;       
    }

    public static Object [][] getArrayIndexAndDuplicate (int [] array){

    int count = getDuplicateCount(array);
    
    Object [][]newArray = new Object [count][];

     int outerCount = 0;
    for (int outerIndex = 0; outerIndex < array.length; outerIndex++){

        for (int innerIndex = outerIndex + 1; innerIndex < array.length; innerIndex++){
        
        if (array[outerIndex] == array[innerIndex]){

        newArray[outerCount] = new Object[2];

        newArray[outerCount][0] = array[outerIndex];

        newArray[outerCount][1] = new int [] {outerIndex, innerIndex};

        outerCount++;

        break;
        }

        }
    }
    return newArray;
    
    }

    public static int [] moveAllZerosIn(int [] array){

    int count = 0;

    for (int index = 0; index < array.length; index++){
    
    if (array[index] == 0) count++;
    }

    for (int counter = 0; counter < count; counter++){

        for (int outerIndex = 0; outerIndex < (array.length)-1; outerIndex++){

        if (array[outerIndex] == 0 && array[outerIndex + 1] != 0){

        int temp = 0;

        temp = array[outerIndex + 1];

        array[outerIndex + 1] = array[outerIndex];

        array[outerIndex] = temp;  

        }

        }
    }
    return array;
    }
}
