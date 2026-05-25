export const arraySplit = (array) => {

    let evenCount = 0;

    let oddCount = 0;

    for (let arrayIndexCount = 0; arrayIndexCount < array.length; arrayIndexCount++){
    
        if (array[arrayIndexCount] % 2 == 0) evenCount++;

        else oddCount++;

    }

    let newArray = Array(2).fill(0);

    newArray[0] = Array(evenCount).fill(0);

    newArray[1] = Array(oddCount).fill(0);

    let evenCountIndex = 0;

    let oddCountIndex = 0;

    for (let newArrayIndexCount = 0; newArrayIndexCount < array.length; newArrayIndexCount++){

        if (array[newArrayIndexCount] % 2 == 0) newArray[0][evenCountIndex++] = array[newArrayIndexCount];

        else newArray[1][oddCountIndex++] = array[newArrayIndexCount];
 
    }

    return newArray;
    
    }
