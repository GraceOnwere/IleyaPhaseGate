import {perfectSquareCheck} from "./perfect-square-array.js"

test("test that i have an array and return the elements that are perfect squares", ()=>{

    let array = [4, 7, 9, 10, 16, 18]

    let arrayCheck = [4,9,16]

    expect(perfectSquareCheck(array)) .toEqual(arrayCheck)
})
