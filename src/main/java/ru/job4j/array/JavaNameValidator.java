package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean result = true;

        if (name.isEmpty() || isUpperLatinLetter(name.charAt(0)) || Character.isDigit(name.charAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            if (!isUpperLatinLetter(name.charAt(i))
                    && !isLowerLatinLetter(name.charAt(i))
                    && !isSpecialSymbol(name.codePointAt(i))
                    && !Character.isDigit(name.charAt(i))) {
                result = false;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
