import {arraySplit} from "./split-array.js"

test("test that a have an array and it splits into even and odd",()=> {

    let array = [45, 60, 3, 10, 9, 22];

    let arrayCheck = [[60, 10, 22],[45, 3, 9]];

    expect(arraySplit(array)) .toEqual(arrayCheck);

})
