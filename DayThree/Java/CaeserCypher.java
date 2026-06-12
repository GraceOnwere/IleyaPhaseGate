public class CaeserCypher{

    public static String encryptText (String word,int shift){

    String encrptedText = "";
    for (int count = 0; count < word.length(); count++){

        char letter = word.charAt(count);        
            
        if(letter >= 'A' && letter <= 'Z'){

        encrptedText += (char) ((letter - 'A' + shift) % 26 + 'A');      
        }

        else if(letter >= 'a' && letter <= 'z'){
    
        encrptedText += (char)((letter - 'a' + shift) % 26 + 'a');   
        }
    }
    return encrptedText;
    }

    public static String decryptText (String word,int shift){

    String decryptedText = "";
    for (int count = 0; count < word.length(); count++){

        char letter = word.charAt(count);        
            
        if(letter >= 'A' && letter <= 'Z'){

        decryptedText += (char) (((letter - 'A' - shift) % 26 + 26) % 26 + 'A');      
        }

        else if(letter >= 'a' && letter <= 'z'){
    
        decryptedText += (char) (((letter - 'a' - shift) % 26 + 26) % 26 + 'a');   
        }
    }
    return decryptedText;
    }

}
