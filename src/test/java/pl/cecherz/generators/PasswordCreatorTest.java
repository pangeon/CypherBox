package pl.cecherz.generators;

import org.junit.Assert;
import org.junit.Test;
import pl.cecherz.utils.TextUtils;

import java.util.Arrays;

public class PasswordCreatorTest {

    @Test
    public void getPassword() {
        PasswordCreator passwordCreator = new PasswordCreator();
        String randomPassword = passwordCreator.getPassword(2);
        char[] signs = passwordCreator.getSignsTable();
        char[] randomPassSigns = TextUtils.explode(randomPassword);

        Assert.assertEquals(95, signs.length);
        Assert.assertEquals(2, randomPassSigns.length);
    }

}