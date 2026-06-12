import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaeserCypherTest{

    @Test
    public void testThatEncryptTextFunctionReturnsEncryptedText(){

    String word = "Grace";

    int shift = 3;

    String actual = CaeserCypher.encryptText(word,shift);

    String expected = "Judfh";

    assertEquals(actual,expected);
    }

     @Test
    public void testThatDecryptTextFunctionReturnsDecryptedText(){

    String word = "Judfh";

    int shift = 3;

    String actual = CaeserCypher.decryptText(word,shift);

    String expected = "Grace";

    assertEquals(actual,expected);
    }

    @Test
    public void testThatEncryptAndDecrptFunctionReturnsInitalText(){

    String word = "Grace";

    int shift = 3;

    String actual = CaeserCypher.encryptText(word,shift);

    String expected = CaeserCypher.decryptText(actual,shift);

    assertEquals(word,expected);
    }

}
