const getDuplicateCount = (array) =>{

    let count = 0;
    for (let outerIndexCount = 0; outerIndexCount < array.length; outerIndexCount++){

        for (let innerIndexCount = outerIndexCount + 1; innerIndexCount < array.length; innerIndexCount++){

        if (array[outerIndexCount] == array[innerIndexCount]){
        
        count++;
        break;
        }
        }
    }
    return count;
}

export const duplicateCheck = (array) =>{

    const count = getDuplicateCount(array);

    let counter = 0;

    let newArray = [];

    for (let outerIndexCount = 0; outerIndexCount < array.length; outerIndexCount++){

        for (let innerIndexCount = outerIndexCount + 1; innerIndexCount < array.length; innerIndexCount++){
        
        if (array[outerIndexCount] == array[innerIndexCount]) {

        newArray.push(array[outerIndexCount]);
        break;
        }
        }
    }
    return newArray;

}

export const getArrayIndexAndDuplicate = (array) =>{
    
    const count = getDuplicateCount(array);

    let counter = 0;

    let newArray = Array(count);

    for (let outerIndexCount = 0; outerIndexCount < array.length; outerIndexCount++){

        for (let innerIndexCount = outerIndexCount + 1; innerIndexCount < array.length; innerIndexCount++){

        if (array[outerIndexCount] == array[innerIndexCount]){

        newArray[counter] = Array(2);

        newArray[counter][0] = array[outerIndexCount];

        newArray[counter][1] = [outerIndexCount, innerIndexCount];

        counter++;

        break; 

        }
        }
    }

    return newArray;
}

export const moveAllZerosIn = (array) =>{

    let count = 0;

    for (let index = 0; index < array.length; index++){
    
    if (array[index] == 0) count++;
    }

    for (let counter = 0; counter < count; counter++){

        for (let outerIndex = 0; outerIndex < (array.length)-1; outerIndex++){

        if (array[outerIndex] == 0 && array[outerIndex + 1] != 0){

         let temp = 0;

         temp = array[outerIndex + 1];

         array[outerIndex + 1] = array[outerIndex];

         array[outerIndex] = temp;  

        }

        }
    }
    return array;

}
console.log(duplicateCheck([1, 2, 3, 2, 4, 3]))
