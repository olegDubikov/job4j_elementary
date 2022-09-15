package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] out = Turn.back(input);
        int[] expected = new int[]{2, 6, 1, 4};
        assertThat(out).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] out = Turn.back(input);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        assertThat(out).containsExactly(expected);
    }
}