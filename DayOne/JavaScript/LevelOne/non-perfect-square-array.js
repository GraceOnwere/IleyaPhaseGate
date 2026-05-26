export const nonPerfectSquareCheck = (array)=>{

    let newArray = Array(array.length).fill(0);

    for (let indexCount = 0; indexCount < array.length; indexCount++){

    let numberSquareRoot = Math.sqrt(array[indexCount]);

    if (numberSquareRoot % 1 != 0) newArray[indexCount] = -1;
      
    else newArray[indexCount] = array[indexCount];  
         
    }

    return newArray;
}
