import {palindromeCheck} from "./palindromic-array.js"

test ("test that an array is not a palindrome returns false", () =>{

    let array =  [45, 0, 8, 0, 1]

    expect(palindromeCheck(array)) .toBe(false)
})

test ("test that an array is a palindrome returns true", () =>{

    let array =  [45, 0, 8, 0, 45]

    expect(palindromeCheck(array)) .toBe(true)
})
