package pl.cecherz.encryption_methods;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import pl.cecherz.utils.TextUtils;
import pl.cecherz.utils.latin.LatinTextUtils;

import static org.junit.Assert.*;

public class CaesarCypherTest {

    @Test
    public void givenEncryptMessageLatinDictWhenMovThreeThenMatchTables() {
        // given
        String messageToEncrypt = "HelloCode";
        CaesarCypher caesarCypher = new CaesarCypher(26);
        LatinTextUtils latinDictionary = new LatinTextUtils();

        // when
        int[] cypherDigits = latinDictionary.textToDigit(TextUtils.explode(messageToEncrypt));
        caesarCypher.changePosition(cypherDigits, 3);
        int[] encryptCypherDigits = {10, 7, 14, 14, 17, 5, 17, 6, 7};

        // then
        Assert.assertArrayEquals(cypherDigits, encryptCypherDigits);
    }
    @Test (expected = ArithmeticException.class)
    public void givenEncryptMessageLatinDictWithParamZeroWhenMovThreeThenCatchException() {
        // given
        String messageToEncrypt = "HelloCode";
        CaesarCypher caesarCypher = new CaesarCypher(0);
        LatinTextUtils latinDictionary = new LatinTextUtils();

        // when
        int[] cypherDigits = latinDictionary.textToDigit(TextUtils.explode(messageToEncrypt));
        caesarCypher.changePosition(cypherDigits, 3);

        // then (expected = ArithmeticException.class)
    }
    @Ignore("Method not implemented yet")
    @Test
    public void rewindPosition() {
        assertEquals(1, 1);
    }
}