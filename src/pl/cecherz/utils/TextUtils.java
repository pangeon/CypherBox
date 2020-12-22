package pl.cecherz.utils;

import java.util.Arrays;

public class TextUtils {
    public static char[] explode(String message) {
        return message.toCharArray();
    }
    public static String concat(char[] digits) {
        StringBuilder message = new StringBuilder();
        for (char digit : digits) {
            message.append(digit);
        }
        return message.toString();
    }
    public static void showDigitCode(int[] digits) {
        System.out.println(Arrays.toString(digits));
    }
    public static void showCharTable(char[] lettersTable) {
        System.out.println(Arrays.toString(lettersTable));
    }
}
