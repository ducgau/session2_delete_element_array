package com.codegym;

import java.util.Scanner;

public class deleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size for array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println(" Size should NOT exceed 20!!!");
            }
        } while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + " of Array is:");
            array[i] = sc.nextInt();
        }
        System.out.print("Array is:     ");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println(" ");

        int index;
        System.out.println("In the Array, You want delete element: ");
        index = sc.nextInt();
        for (int j = index - 1; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = 0;
        System.out.print("New Array is:     ");
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}

