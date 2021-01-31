package pl.cecherz;

import pl.cecherz.encryption_methods.CaesarCipher;
import pl.cecherz.generators.NotRestrictPasswordException;
import pl.cecherz.generators.PasswordCreator;
import pl.cecherz.utils.latin.LatinTextUtils;
import pl.cecherz.utils.polish.PolishTextUtils;

import java.util.Scanner;

public class Start {
    static final Scanner userInterface = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Application is running");
        String command = "";
        String lang;
        String messageToEncrypt;
        String messageToDecrypt;
        int movement;
        int passwordLength;

        while (!(command.equals("exit"))) {
            System.out.println("Set your command: exit, encrypt, decrypt, gen pass");
            command = userInterface.nextLine();
            switch (command) {
                case "encrypt" -> {
                    System.out.println("Set your message to encrypt");
                    messageToEncrypt = userInterface.nextLine();

                    System.out.println("Choose your lang: polish or latin");
                    lang = userInterface.nextLine();

                    System.out.println("Choose movement");
                    movement = userInterface.nextInt();

                    switch(lang) {
                        case "polish"-> encrypt(messageToEncrypt, "polish", movement);
                        case "latin" -> encrypt(messageToEncrypt, "latin", movement);
                    }
                }
                case "decrypt" -> {
                    System.out.println("Set your message to decrypt");
                    messageToDecrypt = userInterface.nextLine();

                    System.out.println("Choose your lang: polish or latin");
                    lang = userInterface.nextLine();

                    System.out.println("Choose movement");
                    movement = userInterface.nextInt();

                    switch(lang) {
                        case "polish"-> decrypt(messageToDecrypt, "polish", movement);
                        case "latin" -> decrypt(messageToDecrypt, "latin", movement);
                    }
                }
                case "gen pass" -> {
                    System.out.println("Welcome in password generator.");
                    System.out.println("Define your password size:");
                    passwordLength = userInterface.nextInt();
                    try {
                        System.out.println("Your secret key: " +
                                new PasswordCreator().getRestrictPassword(passwordLength)
                                + " write it in safety place.");
                    } catch(NotRestrictPasswordException e) {
                        e.printStackTrace();
                        e.printCause();
                    }
                }
            }
        }
        close("Program has closed.");
    }
    public static void encrypt(String messageToEncrypt, String lang, Integer position) {
        LatinTextUtils latinLangDictionary = new LatinTextUtils();
        PolishTextUtils polishLangDictionary = new PolishTextUtils();

        char[] decrypted_letters;
        int[] decrypted_digits;
        String cypher = "";

        switch (lang) {
            case "latin" -> {
                decrypted_letters = LatinTextUtils.explode(messageToEncrypt);
                decrypted_digits = latinLangDictionary.textToDigit(decrypted_letters);
                new CaesarCipher(26).changePosition(decrypted_digits, position);
                cypher = LatinTextUtils.concat(latinLangDictionary.digitToText(decrypted_digits));
                System.out.println(cypher);
            }
            case "polish" -> {
                decrypted_letters = PolishTextUtils.explode(messageToEncrypt);
                decrypted_digits = polishLangDictionary.textToDigit(decrypted_letters);
                new CaesarCipher(35).changePosition(decrypted_digits, position);
                cypher = LatinTextUtils.concat(polishLangDictionary.digitToText(decrypted_digits));
                System.out.println(cypher);
            }
        }
    }
    public static void decrypt(String messageToEncrypt, String lang, Integer position) {
        LatinTextUtils latinLangDictionary = new LatinTextUtils();
        PolishTextUtils polishLangDictionary = new PolishTextUtils();

        char[] encrypted_letters;
        int[] encrypted_digits;
        String cypher = "";

        switch (lang) {
            case "latin" -> {
                encrypted_letters = LatinTextUtils.explode(messageToEncrypt);
                encrypted_digits = latinLangDictionary.textToDigit(encrypted_letters);
                new CaesarCipher(26).rewindPosition(encrypted_digits, position);
                cypher = LatinTextUtils.concat(latinLangDictionary.digitToText(encrypted_digits));
                System.out.println(cypher);
            }
            case "polish" -> {
                encrypted_letters = PolishTextUtils.explode(messageToEncrypt);
                encrypted_digits = polishLangDictionary.textToDigit(encrypted_letters);
                new CaesarCipher(35).rewindPosition(encrypted_digits, position);
                cypher = LatinTextUtils.concat(polishLangDictionary.digitToText(encrypted_digits));
                System.out.println(cypher);
            }
        }
    }
    public static void close(String message) {
        System.out.println(message);
        userInterface.close();
    }
}
