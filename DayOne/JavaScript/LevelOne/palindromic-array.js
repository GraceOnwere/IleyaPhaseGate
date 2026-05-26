export const palindromeCheck = (array) =>{

    let newArray = Array(array.length).fill(0);

    let newArrayIndex = 0;

    for (let indexCount = array.length -1; indexCount >= 0; indexCount--){

        newArray[newArrayIndex] = array[indexCount];

        newArrayIndex++;
    }

    return JSON.stringify(array) === JSON.stringify(newArray);

}
