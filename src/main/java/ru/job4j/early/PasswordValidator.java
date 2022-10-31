package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        String strUp = password.toUpperCase();
        if (password.equals(strUp)) {
            throw new IllegalArgumentException("Password should not contain all uppercase letter");
        }

        String strLow = password.toLowerCase();
        if (password.equals(strLow)) {
            throw new IllegalArgumentException("Password should not contain all lowercase letter");
        }

        boolean digit = false;
        for (Character el : password.toCharArray()) {
            if (Character.isDigit(el)) {
                digit = true;
            }
        }
        if (!digit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }

        boolean symbol = false;
        for (Character el : password.toCharArray()) {
            if (!Character.isLetter(el) && !Character.isDigit(el)) {
                symbol = true;
            }
        }
        if (!symbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        String[] substrings = {"qwerty", "12345", "password", "admin", "user"};
        for (String str : substrings) {
            if (password.toLowerCase().contains(str)) {
                throw new IllegalArgumentException(
                        "Password shouldn't contain substrings: qwerty, 12345, password, admin, user"
                );
            }
        }
        return password;
    }
}