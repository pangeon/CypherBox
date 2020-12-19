package pl.cecherz.utils;

public class TextUtils {
    public static char[] explode(String message) {
        char[] letters = message.toCharArray();
        return letters;
    }
    public static int[] textToDigit(char[] lettersTable) {
        int[] lettersDigits = new int[lettersTable.length];
        for (int i = 0; i < lettersDigits.length; i++) {
            switch (lettersTable[i]) {
                case 'a', 'A' -> lettersDigits[i] = 0;
                case 'ą' -> lettersDigits[i] = 1;
                case 'b', 'B' -> lettersDigits[i] = 2;
                case 'c', 'C' -> lettersDigits[i] = 3;
                case 'ć', 'Ć' -> lettersDigits[i] = 4;
                case 'd', 'D' -> lettersDigits[i] = 5;
                case 'e', 'E' -> lettersDigits[i] = 6;
                case 'ę' -> lettersDigits[i] = 7;
                case 'f', 'F' -> lettersDigits[i] = 8;
                case 'g', 'G' -> lettersDigits[i] = 9;
                case 'h', 'H' -> lettersDigits[i] = 10;
                case 'i', 'I' -> lettersDigits[i] = 11;
                case 'j', 'J' -> lettersDigits[i] = 12;
                case 'k', 'K' -> lettersDigits[i] = 13;
                case 'l', 'L' -> lettersDigits[i] = 14;
                case 'm', 'M' -> lettersDigits[i] = 15;
                case 'n', 'N' -> lettersDigits[i] = 16;
                case 'o', 'O' -> lettersDigits[i] = 17;
                case 'ó', 'Ó' -> lettersDigits[i] = 18;
                case 'p', 'P' -> lettersDigits[i] = 19;
                case 'r', 'R' -> lettersDigits[i] = 20;
                case 's', 'S' -> lettersDigits[i] = 21;
                case 'ś', 'Ś' -> lettersDigits[i] = 22;
                case 't', 'T' -> lettersDigits[i] = 23;
                case 'u', 'U' -> lettersDigits[i] = 24;
                case 'w', 'W' -> lettersDigits[i] = 25;
                case 'y', 'Y' -> lettersDigits[i] = 26;
                case 'z', 'Z' -> lettersDigits[i] = 27;
                case 'ż', 'Ż' -> lettersDigits[i] = 28;
                case 'ź', 'Ź' -> lettersDigits[i] = 29;
                default -> lettersDigits[i] = 30;
            }
        }
        return lettersDigits;
    }
    public static char[] digitToText(int[] intTable) {
        char[] lettersTable = new char[intTable.length];
        for (int i = 0; i < intTable.length; i++) {
            switch (intTable[i]) {
                case 0 -> lettersTable[i] = 'a';
                case 1 -> lettersTable[i] = 'ą';
                case 2 -> lettersTable[i] = 'b';
                case 3 -> lettersTable[i] = 'c';
                case 4 -> lettersTable[i] = 'ć';
                case 5 -> lettersTable[i] = 'd';
                case 6 -> lettersTable[i] = 'e';
                case 7 -> lettersTable[i] = 'ę';
                case 8 -> lettersTable[i] = 'f';
                case 9 -> lettersTable[i] = 'g';
                case 10 -> lettersTable[i] = 'h';
                case 11 -> lettersTable[i] = 'i';
                case 12 -> lettersTable[i] = 'j';
                case 13 -> lettersTable[i] = 'k';
                case 14 -> lettersTable[i] = 'l';
                case 15 -> lettersTable[i] = 'm';
                case 16 -> lettersTable[i] = 'n';
                case 17 -> lettersTable[i] = 'o';
                case 18 -> lettersTable[i] = 'ó';
                case 19 -> lettersTable[i] = 'p';
                case 20 -> lettersTable[i] = 'r';
                case 21 -> lettersTable[i] = 's';
                case 22 -> lettersTable[i] = 'ś';
                case 23 -> lettersTable[i] = 't';
                case 24 -> lettersTable[i] = 'u';
                case 25 -> lettersTable[i] = 'w';
                case 26 -> lettersTable[i] = 'y';
                case 27 -> lettersTable[i] = 'z';
                case 28 -> lettersTable[i] = 'ż';
                case 29 -> lettersTable[i] = 'ź';
                default -> lettersTable[i] = 'x';

            }
        }
        return lettersTable;
    }
    public static String contact(char[] digits) {
        String message = "";
        for (int i = 0; i < digits.length; i++) {
            message += digits[i];
        }
        return message;
    }

}
