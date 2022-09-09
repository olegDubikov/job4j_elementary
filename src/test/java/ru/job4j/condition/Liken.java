package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result1 = first > second;
        boolean result2 = first < second;
        boolean result3 = first == second;
        System.out.println("10>9 это " + result1 + "\n" + "10<9 это " + result2 + "\n" + "10=9 это " + result3);
    }
}
