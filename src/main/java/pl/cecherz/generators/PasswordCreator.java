package pl.cecherz.generators;

import pl.cecherz.utils.TextUtils;

public class PasswordCreator {
    public char[] getSignsTable() {
        String signs = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
        return TextUtils.explode(signs);
    }
    public String getPassword(int size) {
        char[] password = new char[size];
        for (int i = 0; i < size; i++) {
            password[i] = getSignsTable()[(int) (Math.random() * 95)];
        }
        return TextUtils.concat(password);
    }
}
