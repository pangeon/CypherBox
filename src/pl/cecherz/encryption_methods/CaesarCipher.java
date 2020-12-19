package pl.cecherz.encryption_methods;

public class CaesarCipher {

    public static void changePosition(int[] digits, int position) {
        for (int i = 0; i < digits.length; i++) {
            digits[i] += position;
        }
    }
}
