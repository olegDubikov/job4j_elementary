package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double plusAndMultiply(double first, double second) {
        return plus(first, second) + multiply(first, second);
    }

    public static double minusAndDiv(double first, double second) {
        return minus(first, second) + div(first, second);
    }

    public static double allMethods(double first, double second) {
        return plus(first, second) + multiply(first, second)
                + minus(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат: " + plusAndMultiply(10, 20));
        System.out.println("Результат: " + minusAndDiv(10, 20));
        System.out.println("Результат: " + allMethods(10, 20));
    }
}
