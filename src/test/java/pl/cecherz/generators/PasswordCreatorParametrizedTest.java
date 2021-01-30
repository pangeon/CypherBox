package pl.cecherz.generators;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

@RunWith(Parameterized.class)
public class PasswordCreatorParametrizedTest {

    private static PasswordCreator passwordCreator;
    private int passwordSize;
    private static Pattern pattern;

    public PasswordCreatorParametrizedTest(int passwordSize) {
        this.passwordSize = passwordSize;
    }

    @BeforeClass
    public static void init() {
        PasswordCreatorParametrizedTest.passwordCreator = new PasswordCreator();
    }

    @Test
    public void givenDataCollectionWhenCreatePasswordThenPrintIt() {
        int i = passwordSize;
        String[] randomPassword = new String[inputData().size()];

        randomPassword[i] = passwordCreator.getPassword(i);
        System.out.println(i + " " + randomPassword[i]);
    }
    @Test
    public void givenDataCollectionWhenCreatePasswordThenMatchPattern() {
        String randomPassword = passwordCreator.getPassword(passwordSize);
        pattern = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
        Assert.assertTrue(pattern.matcher(randomPassword).matches());
        System.out.println(randomPassword);
    }

    @Parameterized.Parameters
    public static Collection inputData() {
        return Arrays.asList(new Object[][]{
                        {0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9},
                        {10}, {11}, {12}, {13}, {14}, {15}, {16}, {17}, {18}, {19},
                        {20}, {21}, {22}, {23}, {24}, {25}, {26}, {27}, {28}, {29},
                        {30}, {31}, {32}, {33}, {34}, {35}, {36}, {37}, {38}, {39},
                        {40}
                }
        );
    }
}
