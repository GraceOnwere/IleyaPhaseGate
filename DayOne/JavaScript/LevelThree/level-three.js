export const flattenArray = (array) =>{

   let newArray = []

    for (let row of array){

        for (let element of row){

            newArray.push(element);
        }
    }
    return newArray; 
}

//console.log(flattenArray([[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]]));
