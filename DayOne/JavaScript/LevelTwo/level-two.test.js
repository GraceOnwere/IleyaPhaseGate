import {duplicateCheck,getArrayIndexAndDuplicate,moveAllZerosIn} from "./level-two.js"

test("test that i have an array and i return array with its duplicate", ()=>{

    let array = [1, 2, 3, 2, 4, 3];

    let arrayCheck = [2, 3];

    expect(duplicateCheck(array)) .toEqual(arrayCheck);

})

test("test that i have an array and i return a 2D array with the element and its index", ()=>{

    let array = [-11, -9, 3, -9, 2, -11];

    let arrayCheck = [ [-11, [0, 5] ], [-9, [1, 3] ] ];

    expect(getArrayIndexAndDuplicate(array)) .toEqual(arrayCheck);
})

test("test that i have an array and i move all zero elements to the end of the array", ()=>{

    let array = [5, 0, 3, 0, 2, 0];

    let arrayCheck = [5, 3, 2, 0, 0, 0];

    expect(moveAllZerosIn(array)) .toEqual(arrayCheck);

})
