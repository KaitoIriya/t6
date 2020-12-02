package com.company;

import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        int[] mass = arr;
        System.out.println(Arrays.toString(mass));
        for (int left = 0; left < mass.length; left++) {
            int vl = mass[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (vl < mass[i]) {
                    mass[i + 1] = mass[i];
                } else {
                    break;
                }
            }
            mass[i + 1] = vl;
        }
        System.out.println(Arrays.toString(mass));
    }
}
