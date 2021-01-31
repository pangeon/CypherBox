package pl.cecherz.generators;

import pl.cecherz.utils.TextUtils;

import java.util.regex.Pattern;

public class PasswordCreator {

    public String getRestrictPassword(int size) throws NotRestrictPasswordException {
        String password = "";
        if(size >= 8) {
            while (!(isRestrictPassword(password))) password = getRandomPassword(size);
            return password;
        }
        throw new NotRestrictPasswordException();
    }
    public char[] getSignsTable() {
        String signs = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
        return TextUtils.explode(signs);
    }
    public String getRandomPassword(int size) {
        char[] password = new char[size];
        for (int i = 0; i < size; i++) {
            password[i] = getSignsTable()[(int) (Math.random() * 95)];
        }
        return TextUtils.concat(password);
    }
    private boolean isRestrictPassword(String password) {
        String regex = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(password).matches();
    }
}
