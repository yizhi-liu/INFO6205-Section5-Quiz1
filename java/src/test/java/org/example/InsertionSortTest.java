package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sort_sortsArrayWithMultipleElements() {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {5, 3, 8, 4, 2};
        Integer[] expected = {2, 3, 4, 5, 8};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sort_sortsArrayWithSingleElement() {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {1};
        Integer[] expected = {1};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sort_sortsEmptyArray() {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {};
        Integer[] expected = {};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sort_sortsArrayWithDuplicateElements() {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {4, 2, 4, 3, 2};
        Integer[] expected = {2, 2, 3, 4, 4};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sort_sortsArrayWithNegativeElements() {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {3, -1, 2, -5, 0};
        Integer[] expected = {-5, -1, 0, 2, 3};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sort_sortsArrayWithAllIdenticalElements() {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {7, 7, 7, 7, 7};
        Integer[] expected = {7, 7, 7, 7, 7};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sort_sortsArrayWithAlreadySortedElements() {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sort_sortsArrayWithReverseSortedElements() {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sort_sortsArrayWithMixedPositiveAndNegativeElements() {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {-3, 2, -1, 4, 0};
        Integer[] expected = {-3, -1, 0, 2, 4};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }
}