package com.mvp.tasks;

import java.util.Random;

public class QuickSort {
    public static int ARRAY_LENGTH = 0;
    private static int[] array;
    private static int supportingElement = 2;
    private static int countOfRecursion = 0;
    private static int countOfChanger = 0;
    private static Random generator = new Random();

    public static void setArrayLength(int ARRAY_LENGTH_PROTOTYPE)
    {
        array=new int[ARRAY_LENGTH_PROTOTYPE];
        ARRAY_LENGTH=ARRAY_LENGTH_PROTOTYPE;
    }

    public static void initArray() {
        for (int i=0; i<ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt(100);
        }
    }

    public static void printArray() {
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH-1]);
    }

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }

    private static void doSort(int start, int end) {
        countOfRecursion++;
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / supportingElement;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                countOfChanger++;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }

    public static void setSupportingElement(int supportingElement) {
        QuickSort.supportingElement = supportingElement;
    }

    public static int getSupportingElement() {
        return supportingElement;
    }

    public static int getCountOfRecursion() {
        return countOfRecursion;
    }

    public static int getCountOfChanger() {
        return countOfChanger;
    }

    public static void setCountOfRecursion(int countOfRecursion) {
        QuickSort.countOfRecursion = countOfRecursion;
    }

    public static void setCountOfChanger(int countOfChanger) {
        QuickSort.countOfChanger = countOfChanger;
    }
}
