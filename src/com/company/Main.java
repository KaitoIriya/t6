package com.company;

import java.util.Arrays;

public class Main {
    private static void arrayCompound(int[] a, int[] b, int[] c){
        int count = 0;
        for(int i = 0; i<a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0;j<b.length;j++) {
            c[count++] = b[j];
        }
    }
    public static void main(String[] args) {

        System.out.println("Insertion Sort:");
        int[] arr1 = new int[] {4, 2, 5, 12, 6, 23, 7, 2, 0, 21};
        int[] arr2 = new int[] {5, 6, 1, 11, 67, 43, 44, 14, 10, 2};
        int[] arr3 = new int[20];


        //Сортировка вставками
        InsertionSort sort1 = new InsertionSort();
        sort1.insertionSort(arr1);

        System.out.println();
        System.out.println("Quick Sort:");

        //Быстрая сортировка
        QuickSort sort2 = new QuickSort();
        System.out.println(Arrays.toString(arr2));
        sort2.quickSort(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));

        System.out.println();
        System.out.println("Merge Sort:");

        //Соединение (arr1 и arr2) в (arr3)
        arrayCompound(arr1, arr2, arr3);

        //Сортировка слиянием
        MergeSort sort3 = new MergeSort();
        System.out.println(Arrays.toString(arr3));
        sort3.mergeSort(arr3, 0, arr3.length-1);
        System.out.println(Arrays.toString(arr3));
    }



}