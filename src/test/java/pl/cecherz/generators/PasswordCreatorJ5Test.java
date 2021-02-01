package pl.cecherz.generators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

public class PasswordCreatorJ5Test {

    private PasswordCreator passwordCreator;

    @BeforeEach
    public void setUp() {
        passwordCreator = new PasswordCreator();
    }
    @Test
    void givenNegativeParamWhenUseRandomPasswordThenThrowException() {
        Throwable exceptions = Assertions.assertThrows(NegativeArraySizeException.class, () -> {
            passwordCreator.getRandomPassword(-1);
        });
        Assertions.assertEquals(exceptions.getMessage(), "-1");
    }
    @RepeatedTest(100)
    void givenRandomPasswordWhenRepeatManyTimesThenCheckRestriction(RepetitionInfo repetitionInfo) {
        String randomPassword = passwordCreator.getRandomPassword(10);
        Assertions.assertTrue(passwordCreator.isRestrictPassword(randomPassword));
        System.out.println(repetitionInfo.getCurrentRepetition() + " " + randomPassword);
    }

}
