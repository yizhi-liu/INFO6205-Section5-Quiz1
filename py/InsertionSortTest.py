import unittest

from InsertionSort import InsertionSort


class InsertionSortTest(unittest.TestCase):
    def test_sort_already_sorted(self):
        sorter = InsertionSort([1, 2, 3, 4, 5])
        self.assertEqual(sorter.sort(), [1, 2, 3, 4, 5])

    def test_sort_reverse_order(self):
        sorter = InsertionSort([5, 4, 3, 2, 1])
        self.assertEqual(sorter.sort(), [1, 2, 3, 4, 5])

    def test_sort_random_order(self):
        sorter = InsertionSort([3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5])
        self.assertEqual(sorter.sort(), [1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9])

    def test_sort_empty_array(self):
        sorter = InsertionSort([])
        self.assertEqual(sorter.sort(), [])

    def test_sort_single_element(self):
        sorter = InsertionSort([42])
        self.assertEqual(sorter.sort(), [42])

    def test_sort_duplicate_elements(self):
        sorter = InsertionSort([3, 3, 3, 1, 1, 2, 2])
        self.assertEqual(sorter.sort(), [1, 1, 2, 2, 3, 3, 3])

    def test_sort_negative_numbers(self):
        sorter = InsertionSort([-5, 2, -8, 0, 3, -1])
        self.assertEqual(sorter.sort(), [-8, -5, -1, 0, 2, 3])

    def test_sort_floating_point_numbers(self):
        sorter = InsertionSort([3.14, 2.71, 1.41, 0.58])
        self.assertEqual(sorter.sort(), [0.58, 1.41, 2.71, 3.14])


if __name__ == '__main__':
    unittest.main()
