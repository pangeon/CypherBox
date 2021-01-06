package pl.cecherz.utils.latin;

import pl.cecherz.utils.Dictionary;
import pl.cecherz.utils.TextUtils;

public class LatinTextUtils extends TextUtils implements Dictionary {
    public int[] textToDigit(char[] lettersTable) {
        int[] lettersDigits = new int[lettersTable.length];
        for (int i = 0; i < lettersDigits.length; i++) {
            switch (lettersTable[i]) {
                case 'a', 'A' -> lettersDigits[i] = 0;
                case 'b', 'B' -> lettersDigits[i] = 1;
                case 'c', 'C' -> lettersDigits[i] = 2;
                case 'd', 'D' -> lettersDigits[i] = 3;
                case 'e', 'E' -> lettersDigits[i] = 4;
                case 'f', 'F' -> lettersDigits[i] = 5;
                case 'g', 'G' -> lettersDigits[i] = 6;
                case 'h', 'H' -> lettersDigits[i] = 7;
                case 'i', 'I' -> lettersDigits[i] = 8;
                case 'j', 'J' -> lettersDigits[i] = 9;
                case 'k', 'K' -> lettersDigits[i] = 10;
                case 'l', 'L' -> lettersDigits[i] = 11;
                case 'm', 'M' -> lettersDigits[i] = 12;
                case 'n', 'N' -> lettersDigits[i] = 13;
                case 'o', 'O' -> lettersDigits[i] = 14;
                case 'p', 'P' -> lettersDigits[i] = 15;
                case 'q', 'Q' -> lettersDigits[i] = 16;
                case 'r', 'R' -> lettersDigits[i] = 17;
                case 's', 'S' -> lettersDigits[i] = 18;
                case 't', 'T' -> lettersDigits[i] = 19;
                case 'u', 'U' -> lettersDigits[i] = 20;
                case 'v', 'V' -> lettersDigits[i] = 21;
                case 'w', 'W' -> lettersDigits[i] = 22;
                case 'x', 'X' -> lettersDigits[i] = 23;
                case 'y', 'Y' -> lettersDigits[i] = 24;
                case 'z', 'Z' -> lettersDigits[i] = 25;
            }
        }
        return lettersDigits;
    }
    public char[] digitToText(int[] intTable) {
        char[] lettersTable = new char[intTable.length];
        for (int i = 0; i < intTable.length; i++) {
            switch (intTable[i]) {
                case 0 -> lettersTable[i] = 'a';
                case 1 -> lettersTable[i] = 'b';
                case 2 -> lettersTable[i] = 'c';
                case 3 -> lettersTable[i] = 'd';
                case 4 -> lettersTable[i] = 'e';
                case 5 -> lettersTable[i] = 'f';
                case 6 -> lettersTable[i] = 'g';
                case 7 -> lettersTable[i] = 'h';
                case 8 -> lettersTable[i] = 'i';
                case 9 -> lettersTable[i] = 'j';
                case 10 -> lettersTable[i] = 'k';
                case 11 -> lettersTable[i] = 'l';
                case 12 -> lettersTable[i] = 'm';
                case 13 -> lettersTable[i] = 'n';
                case 14 -> lettersTable[i] = 'o';
                case 15 -> lettersTable[i] = 'p';
                case 16 -> lettersTable[i] = 'q';
                case 17 -> lettersTable[i] = 'r';
                case 18 -> lettersTable[i] = 's';
                case 19 -> lettersTable[i] = 't';
                case 20 -> lettersTable[i] = 'u';
                case 21 -> lettersTable[i] = 'v';
                case 22 -> lettersTable[i] = 'w';
                case 23 -> lettersTable[i] = 'x';
                case 24 -> lettersTable[i] = 'y';
                case 25 -> lettersTable[i] = 'z';
            }
        }
        return lettersTable;
    }
}
