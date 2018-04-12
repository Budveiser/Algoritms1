package com.company;

public class Bubblesort {

    public static void main (String[]args){
        int[] array ={23,454,234,567,87,997,278,983};

        for (int j=1; j <= array.length; j++) {

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    System.out.println("hello");
                    System.out.println("hello32");
                    System.out.println("hello3");
                }
            }
        }
        for (int o:array){
            System.out.println(o);
        }
    }
}
