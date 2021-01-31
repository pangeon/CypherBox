package pl.cecherz.generators;

import org.junit.*;
import pl.cecherz.utils.TextUtils;
import java.util.Arrays;
import java.util.Date;

public class PasswordCreatorTest {

    private static PasswordCreator passwordCreator;

    private static Date timestamp;
    private static long beforeTime;
    private static long afterTime;

    @BeforeClass
    public static void init() {
        PasswordCreatorTest.passwordCreator = new PasswordCreator();
        PasswordCreatorTest.timestamp = new Date();
        PasswordCreatorTest.beforeTime = timestamp.getTime();
    }
    @AfterClass
    public static void release() {
        PasswordCreatorTest.timestamp = new Date();
        PasswordCreatorTest.afterTime = timestamp.getTime();
        System.out.println(PasswordCreatorTest.class + " execution time: " + (afterTime - beforeTime) + " ms");
    }
    @Test
    public void checkLengthPasswordWhenUsePasswordCreator() {
        String[] randomPassword = new String[10];
        for(int i = 0; i < randomPassword.length; i++) {
            randomPassword[i] = passwordCreator.getRandomPassword(i);
            System.out.println(i + " " + randomPassword[i]);
            Assert.assertEquals("Password length is not correct", i, randomPassword[i].length());
        }
    }
    @Test
    public void showSignsInRandomPassword() {
        char[] signsRandomPassword = TextUtils.explode(passwordCreator.getRandomPassword(20));
        System.out.println(Arrays.toString(signsRandomPassword));
    }
    @Test
    public void matchRandomPasswordToPattern() {
        char[] signsRandomPassword = TextUtils.explode(passwordCreator.getRandomPassword(100));
        char[] allSignsInGenerator = passwordCreator.getSignsTable();
        for (char signPass : signsRandomPassword)
            for (char signPattern : allSignsInGenerator)
                if (signPass == signPattern) Assert.assertEquals("Password not match to pattern", signPass, signPattern);
    }
}

