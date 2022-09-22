package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int getMoney = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (getMoney - i >= 0) {
                getMoney -= i;
                rsl[size++] = i;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
