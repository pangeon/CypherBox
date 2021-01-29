package pl.cecherz.encryption_methods;

import org.junit.*;
import pl.cecherz.generators.PasswordCreatorTest;
import pl.cecherz.utils.TextUtils;
import pl.cecherz.utils.latin.LatinTextUtils;

import java.util.Date;

import static org.junit.Assert.*;

public class CaesarCypherTest {

    private static LatinTextUtils latinDictionary;
    private static CaesarCypher caesarCypher;
    private int[] cypherDigits;

    private static Date timestamp;
    private static long beforeTime;
    private static long afterTime;

    @BeforeClass
    public static void init() {
        CaesarCypherTest.latinDictionary = new LatinTextUtils();
        CaesarCypherTest.caesarCypher = new CaesarCypher(0);

        CaesarCypherTest.timestamp = new Date();
        CaesarCypherTest.beforeTime = timestamp.getTime();
    }
    @Before
    public void setup() {
        String messageToEncrypt = "HelloCode";
        cypherDigits = latinDictionary.textToDigit(TextUtils.explode(messageToEncrypt));
    }
    @AfterClass
    public static void release() {
        CaesarCypherTest.timestamp = new Date();
        CaesarCypherTest.afterTime = timestamp.getTime();
        System.out.println(CaesarCypherTest.class + " execution time: " + (afterTime - beforeTime) + " ms");
    }

    @Test
    public void givenEncryptMessageLatinDictWhenMovThreeThenMatchTables() {
        caesarCypher.setDictionaryLength(26);
        caesarCypher.changePosition(cypherDigits, 3);
        int[] encryptCypherDigits = {10, 7, 14, 14, 17, 5, 17, 6, 7};
        Assert.assertArrayEquals(cypherDigits, encryptCypherDigits);
    }
    @Test (expected = ArithmeticException.class)
    public void givenEncryptMessageLatinDictWithParamZeroWhenMovThreeThenCatchException() {
        caesarCypher.setDictionaryLength(0);
        caesarCypher.changePosition(cypherDigits, 3);
    }
    @Ignore("Method not implemented yet")
    @Test
    public void rewindPosition() {
        assertEquals(1, 1);
    }
}