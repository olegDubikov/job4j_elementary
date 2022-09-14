package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Иван";
        names[1] = "Василий";
        names[2] = "Петр";
        names[3] = "Алексей";
        String boy = names[3];
        System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + boy);
    }
}