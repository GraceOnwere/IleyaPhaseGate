public class NonPerfectSquareArray{

    public static double [] nonPerfectSquareCheck(int [] array){

    double [] newArray = new double [array.length];

    for (int indexCount = 0; indexCount < array.length; indexCount++){

    double numberSquareRoot = Math.sqrt(array[indexCount]);

    if (numberSquareRoot % 1 != 0) newArray[indexCount] = -1.0;
      
    else newArray[indexCount] = array[indexCount];  
            
    }

    return newArray;
    }
}
