package pl.cecherz.encryption_methods;

public class CaesarCipher {

    private final int dictionaryLength;

    public int getDictionaryLength() {
        return dictionaryLength;
    }
    public CaesarCipher(int dictionaryLength) {
        this.dictionaryLength = dictionaryLength;
    }
    public void changePosition(int[] digits, int position) {
        for (int i = 0; i < digits.length; i++) {
            digits[i] += position;
            digits[i] %= getDictionaryLength();
        }
    }
    public void rewindPosition(int[] digits, int position) {
        for (int i = 0; i < digits.length; i++) {
            digits[i] -= position;
            digits[i] %= getDictionaryLength();
            if(digits[i] < 0) digits[i] += getDictionaryLength();
        }
    }
}
