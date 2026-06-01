import {getFlattenArray} from "./level-three.js"

test("test that i have a 2D array and i flatten it into a new array", ()=>{

    let array = [[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]];

    let arrayCheck = [9,0,7,3,5,1,8,1,7,9,9,6];

    expect(getFlattenArray(array)) .toEqual(arrayCheck);
})
