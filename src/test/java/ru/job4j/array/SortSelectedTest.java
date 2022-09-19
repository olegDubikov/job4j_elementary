package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5El() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort4El() {
        int[] data = new int[]{7, 4, 1, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 4, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort6El() {
        int[] data = new int[]{6, 3, 8, 1, 9, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 3, 6, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}