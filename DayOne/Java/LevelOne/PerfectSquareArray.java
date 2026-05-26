public class PerfectSquareArray{

    public static double [] perfectSquareCheck(int [] array){

    int perfectSquareCount = 0;

    for (int indexCount = 0; indexCount < array.length; indexCount++){

        double numberSquareRoot = Math.sqrt(array[indexCount]);

        if (numberSquareRoot % 1 == 0) perfectSquareCount++;

        }

    double [] newArray = new double [perfectSquareCount];

    int index = 0;

    for (int newArrayIndexCount = 0; newArrayIndexCount < array.length; newArrayIndexCount++){

        double numberSquareRoot = Math.sqrt(array[newArrayIndexCount]);

        if (numberSquareRoot % 1 == 0) {
            
            newArray[index] = array[newArrayIndexCount];
        
            index++;
        
        }
    
    } 

    return newArray;
    }
}
