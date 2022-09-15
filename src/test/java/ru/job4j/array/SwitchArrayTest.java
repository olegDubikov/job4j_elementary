package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {9, 5, 1, 3, 5, 7};
        int source = 2;
        int dest = 3;
        int[] out = SwitchArray.swap(input, source, dest);
        int[] expected = {9, 5, 3, 1, 5, 7};
        assertThat(out).containsExactly(expected);
    }
}