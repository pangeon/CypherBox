package pl.cecherz.generators;

import org.junit.Assert;
import org.junit.Test;
import pl.cecherz.utils.TextUtils;

import java.util.Arrays;

public class PasswordCreatorTest {

    @Test
    public void checkLengthPasswordWhenUsePasswordCreator() {
        PasswordCreator passwordCreator = new PasswordCreator();
        String[] randomPassword = new String[100];
        for(int i = 0; i < randomPassword.length; i++) {
            randomPassword[i] = passwordCreator.getPassword(i);
            System.out.println(i + " " + randomPassword[i]);
            Assert.assertEquals("Password length is not correct", i, randomPassword[i].length());
        }
    }
    @Test
    public void showSignsInRandomPassword() {
        PasswordCreator passwordCreator = new PasswordCreator();
        char[] signsRandomPassword = TextUtils.explode(passwordCreator.getPassword(20));
        System.out.println(Arrays.toString(signsRandomPassword));
    }
    @Test
    public void matchRandomPasswordToPattern() {
        PasswordCreator passwordCreator = new PasswordCreator();
        char[] signsRandomPassword = TextUtils.explode(passwordCreator.getPassword(100));
        char[] allSignsInGenerator = passwordCreator.getSignsTable();
        for (char signPass : signsRandomPassword)
            for (char signPattern : allSignsInGenerator)
                if (signPass == signPattern) Assert.assertEquals("Password not match to pattern", signPass, signPattern);
    }
}

