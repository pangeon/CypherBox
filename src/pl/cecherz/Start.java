package pl.cecherz;

import pl.cecherz.encryption_methods.CaesarCipher;
import pl.cecherz.utils.TextUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Start {
    static final Scanner userInterface = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Application is running");
        String command = "";
        String messageToEncrypt = "";

        while (!(command.equals("exit"))) {
            System.out.println("Set your command");
            command = userInterface.nextLine();
            if(command.equals("encrypt")) {
                System.out.println("Set your message to encrypted");
                messageToEncrypt = userInterface.nextLine();
                char[] letters = TextUtils.explode(messageToEncrypt);
                int[] digits = TextUtils.textToDigit(letters);
                CaesarCipher.changePosition(digits, 3);
                String cypher = TextUtils.contact(TextUtils.digitToText(digits));
                System.out.println(cypher);
            }
        }
        System.out.println("Program has been closed");
        userInterface.close();
    }
}
