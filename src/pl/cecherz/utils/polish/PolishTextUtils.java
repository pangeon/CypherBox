package pl.cecherz.utils.polish;

import pl.cecherz.utils.Dictionary;
import pl.cecherz.utils.TextUtils;

public class PolishTextUtils extends TextUtils implements Dictionary {

    public int[] textToDigit(char[] lettersTable) {
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
                case 'ł', 'Ł' -> lettersDigits[i] = 15;
                case 'm', 'M' -> lettersDigits[i] = 16;
                case 'n', 'N' -> lettersDigits[i] = 17;
                case 'ń' -> lettersDigits[i] = 18;
                case 'o', 'O' -> lettersDigits[i] = 19;
                case 'ó', 'Ó' -> lettersDigits[i] = 20;
                case 'p', 'P' -> lettersDigits[i] = 21;
                case 'q', 'Q' -> lettersDigits[i] = 22;
                case 'r', 'R' -> lettersDigits[i] = 23;
                case 's', 'S' -> lettersDigits[i] = 24;
                case 'ś', 'Ś' -> lettersDigits[i] = 25;
                case 't', 'T' -> lettersDigits[i] = 26;
                case 'u', 'U' -> lettersDigits[i] = 27;
                case 'v', 'V' -> lettersDigits[i] = 28;
                case 'w', 'W' -> lettersDigits[i] = 29;
                case 'x', 'X' -> lettersDigits[i] = 30;
                case 'y', 'Y' -> lettersDigits[i] = 31;
                case 'z', 'Z' -> lettersDigits[i] = 32;
                case 'ź', 'Ź' -> lettersDigits[i] = 33;
                case 'ż', 'Ż' -> lettersDigits[i] = 34;
            }
        }
        return lettersDigits;
    }
    public char[] digitToText(int[] intTable) {
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
                case 15 -> lettersTable[i] = 'ł';
                case 16 -> lettersTable[i] = 'm';
                case 17 -> lettersTable[i] = 'n';
                case 18 -> lettersTable[i] = 'ń';
                case 19 -> lettersTable[i] = 'o';
                case 20 -> lettersTable[i] = 'ó';
                case 21 -> lettersTable[i] = 'p';
                case 22 -> lettersTable[i] = 'q';
                case 23 -> lettersTable[i] = 'r';
                case 24 -> lettersTable[i] = 's';
                case 25 -> lettersTable[i] = 'ś';
                case 26 -> lettersTable[i] = 't';
                case 27 -> lettersTable[i] = 'u';
                case 28 -> lettersTable[i] = 'v';
                case 29 -> lettersTable[i] = 'w';
                case 30 -> lettersTable[i] = 'x';
                case 31 -> lettersTable[i] = 'y';
                case 32 -> lettersTable[i] = 'z';
                case 33 -> lettersTable[i] = 'ź';
                case 34 -> lettersTable[i] = 'ż';
            }
        }
        return lettersTable;
    }
}
