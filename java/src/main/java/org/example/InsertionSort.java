package org.example;

public class InsertionSort {
    //Sorts the array using Insertion Sort.
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            insert(i, a);
        }
    }

    private void insert(int i, Comparable[] a) {
        //Inserts the 'Transition element' into its correct position in the sorted portion of the array.
        //TODO: TO BE IMPLEMENTED
        for (int j = 0; j < i; j ++){
            if (a[i].compareTo(a[j]) > 0 ){
                continue;
            } else if (a[i].compareTo(a[j]) < 0){
                for (int y = i; y > j; y--){
                    swap(a, y,y-1);
                }
            }
        }
    }

    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
