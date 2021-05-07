package com.example.sort;

import java.util.Random;

/**
 * 线性排序
 *
 * 1. 冒泡
 * 2. 插入
 * 3. 选择
 *
 * @author 600847
 */
public class SimpleOrder {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sortArray = new int[15];
        for (int i = 0; i < 15; i++) {
            sortArray[i] = random.nextInt(10);
        }
        // bubbleSort(sortArray);
        // insertSort(sortArray);
        chooseSort(sortArray);

        for (int i : sortArray) {
            System.out.print(i + " ");
        }
    }

    /**
     * 冒泡
     *
     * @param sortArray
     */
    private static void bubbleSort(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            boolean flag = false;
            for (int j = 0; j < sortArray.length - i - 1; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    int temp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
    }

    /**
     * 插入
     *
     * @param sortArray
     */
    private static void insertSort(int[] sortArray) {
        for (int i = 1; i < sortArray.length; i++) {
            int value = sortArray[i];
            int j = i - 1;
            for (; j > 0; j--) {
                if (sortArray[j] > value) {
                    sortArray[j + 1] = sortArray[j];
                } else {
                    break;
                }
            }
            sortArray[j] = value;
        }
    }

    /**
     * 选择排序
     *
     * @param sortArray
     */
    private static void chooseSort(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[j] < sortArray[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = sortArray[i];
                sortArray[i] = sortArray[minIndex];
                sortArray[minIndex] = temp;
            }
        }
    }
}
