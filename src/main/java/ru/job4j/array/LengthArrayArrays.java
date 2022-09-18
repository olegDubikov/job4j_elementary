package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] arrays = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Размер вложенных массивов, массива arrays равен: " + arrays[i].length);
        }
    }
}
