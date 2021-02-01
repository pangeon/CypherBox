package pl.cecherz.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.cecherz.generators.PasswordCreator;

import java.util.Arrays;

class TextUtilsTest {

    private PasswordCreator passwordCreator;
    private int passwordSize;
    private String message;
    private char[] explodeMessage;

    @BeforeEach
    public void setUp() {
        passwordCreator = new PasswordCreator();
        passwordSize = 100;
        message = passwordCreator.getRandomPassword(passwordSize);
        explodeMessage = TextUtils.explode(message);
    }

    @Test
    void givenRandomMessageToExplodeWhenOneSignIsThenCheckIsNotExistInTable() {
        explodeMessage = TextUtils.explode(message);
        System.out.println(Arrays.toString(explodeMessage));
        char signToSearch = 'a';
        int i = 0;
        for (char c : explodeMessage) {
            Assumptions.assumeFalse(c == signToSearch);
            i++;
        }
        Assumptions.assumeTrue(i == passwordSize);
        System.out.println("Letter not exist in this table !");
    }
}