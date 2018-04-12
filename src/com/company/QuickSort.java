package com.company;
import java.util.Arrays;

public class QuickSort {

    private static void quickSort(int[] array, int low, int high) {

        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] array = {23,454,234,567,87,997,278,983};

        int low = 0;
        int high = array.length - 1;

        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
    }
}