import {nonPerfectSquareCheck} from "./non-perfect-square-array.js"

test("test that i have an array and replaces the elements that are perfect squares to -1", ()=>{

    let array = [4, 7, 9, 10, 49, 6]

    let arrayCheck = [4, -1, 9, -1, 49, -1]

    expect(nonPerfectSquareCheck(array)) .toEqual(arrayCheck)
})
