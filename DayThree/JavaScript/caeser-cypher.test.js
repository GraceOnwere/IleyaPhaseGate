import {encryptText,decryptText} from "./caeser-cypher.js";

test("test that Encryption Fucnction returns encrypted text",()=>{

    let word = "Grace";

    let shift = 3;

    let encryptedText = "Judfh";

    expect(encryptText(word,shift)) .toBe(encryptedText);
})

test("test that Decryption Fucnction returns decrypted text",()=>{

    let word = "Judfh";

    let shift = 3;

    let decryptedText = "Grace";

    expect(decryptText(word,shift)) .toBe(decryptedText);
})

test("test that Encryption and Decryption Fucnction returns original text",()=>{

    let word = "Grace";

    let shift = 3;

    let encryptedText = encryptText(word,shift);

    expect(decryptText(encryptedText,shift)) .toBe(word);
})
