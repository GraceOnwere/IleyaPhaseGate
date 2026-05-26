export const perfectSquareCheck = (array) =>{

    let perfectSquareCount = 0;

    for (let indexCount = 0; indexCount < array.length; indexCount++){
    
         if  (Number.isInteger(Math.sqrt(array[indexCount])))
        
            perfectSquareCount++;
    }

    let newArray = Array(perfectSquareCount).fill(0);

    let index = 0

    for (let newArrayIndexCount = 0; newArrayIndexCount < array.length; newArrayIndexCount++){

        if  (Number.isInteger(Math.sqrt(array[newArrayIndexCount]))){

            newArray[index] = array[newArrayIndexCount];

            index++;

        }
    }

    return newArray;     
}
