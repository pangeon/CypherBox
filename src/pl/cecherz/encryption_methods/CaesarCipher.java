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
        for (int i = 0; i < digits.length - 1; i++) {
            digits[i] = digits[i] + position;
            digits[i] = digits[i] % getDictionaryLength();
        }
    }
    public void rewindPosition(int[] digits, int position) {
        for (int i = 0; i < digits.length - 1; i++) {
            digits[i] = digits[i] - position;
            digits[i] = digits[i] % getDictionaryLength();
        }
    }


}
