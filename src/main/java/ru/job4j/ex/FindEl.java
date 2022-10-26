package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("key not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"Ivan", "Igor"};
        String key = "Stepan";
        try {
            indexOf(value, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}