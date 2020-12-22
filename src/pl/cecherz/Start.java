package pl.cecherz;

import pl.cecherz.encryption_methods.CaesarCipher;
import pl.cecherz.utils.polish.PolishTextUtils;

import java.util.Scanner;

public class Start {
    static final Scanner userInterface = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Application is running");
        String command = "";
        String messageToEncrypt;
        String messageToDecrypt;

        while (!(command.equals("exit"))) {
            System.out.println("Set your command");
            command = userInterface.nextLine();
            switch (command) {
                case "encrypt" -> {
                    System.out.println("Set your message to encrypt");
                    messageToEncrypt = userInterface.nextLine();

                    char[] decrypted_letters = PolishTextUtils.explode(messageToEncrypt);
                    int[] decrypted_digits = PolishTextUtils.textToDigit(decrypted_letters);

                    new CaesarCipher(35).changePosition(decrypted_digits, 12);
                    String cypher = PolishTextUtils.concat(PolishTextUtils.digitToText(decrypted_digits));
                    System.out.println(cypher);
                }
                case "decrypt" -> {
                    System.out.println("Set your message to decrypt");
                    messageToDecrypt = userInterface.nextLine();

                    char[] encrypted_letters = PolishTextUtils.explode(messageToDecrypt);
                    int[] encrypted_digits = PolishTextUtils.textToDigit(encrypted_letters);

                    new CaesarCipher(35).rewindPosition(encrypted_digits, 12);
                    String encrypted_cypher = PolishTextUtils.concat(PolishTextUtils.digitToText(encrypted_digits));
                    System.out.println(encrypted_cypher);
                }
                case "exit" -> {
                }
                default -> System.out.println("Bad command. Available: exit, encrypt, decrypt");
            }
        }
        close("Program has closed.");
    }
    public static void close(String message) {
        System.out.println(message);
        userInterface.close();
    }
}
