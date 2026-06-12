export const encryptText = (word,shift) =>{

let encrptedText = "";
    
for (let count = 0; count < word.length; count++){
        
    let letter = word.charAt(count);        
            
    if(letter >= 'A' && letter <= 'Z'){

        encrptedText +=  String.fromCharCode(((letter.charCodeAt(0) - 65 + shift) % 26 + 65));      
        }

    else if(letter >= 'a' && letter <= 'z'){
    
        encrptedText += String.fromCharCode(((letter.charCodeAt(0) - 97 + shift) % 26 + 97));   
        }
    }
    return encrptedText;
    }

export const decryptText = (word,shift) =>{

let decryptedText = "";

for (let count = 0; count < word.length; count++){

    let letter = word.charAt(count);        
                    
    if(letter >= 'A' && letter <= 'Z'){

    decryptedText += String.fromCharCode(((letter.charCodeAt(0) - 65 - shift) % 26 + 26) % 26 + 65);      
    }

    else if(letter >= 'a' && letter <= 'z'){
    
    decryptedText += String.fromCharCode(((letter.charCodeAt(0) - 97 - shift) % 26 + 26) % 26 + 97);   
    }
         }
    return decryptedText;
    }

console.log(encryptText("Grace",3));
