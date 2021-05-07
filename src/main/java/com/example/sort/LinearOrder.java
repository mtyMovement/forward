package com.example.sort;

import java.util.Random;

/**
 * 线性排序
 * <p>
 * 1. 归并
 * 2. 快排
 *
 * @author 600847
 */
public class LinearOrder {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sortArray = new int[50];
        for (int i = 0; i < 50; i++) {
            sortArray[i] = random.nextInt(10);
        }

        mergeSort(sortArray, 0, sortArray.length - 1);

        for (int i : sortArray) {
            System.out.print(i + " ");
        }
    }

    /**
     * 归并排序
     *
     * @param sortArray
     */
    private static void mergeSort(int[] sortArray, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(sortArray, start, mid);
        mergeSort(sortArray, mid + 1, end);

        mergeTwoArray(sortArray, start, mid, end);
    }

    /**
     * 合并分区结果
     *
     * @param sortArray
     * @param start
     * @param mid
     * @param end
     */
    private static void mergeTwoArray(int[] sortArray, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (sortArray[i] <= sortArray[j]) {
                temp[k++] = sortArray[i++];
            } else {
                temp[k++] = sortArray[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = sortArray[i++];
        }

        while (j <= end) {
            temp[k++] = sortArray[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            sortArray[x + start] = temp[x];
        }
    }
}
