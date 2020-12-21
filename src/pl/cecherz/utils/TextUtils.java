package pl.cecherz.utils;

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
}
