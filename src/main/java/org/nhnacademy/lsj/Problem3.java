package org.nhnacademy.lsj;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Arrays.sort() 및 SelectionSort()의 시간차이 측정.
 */
public class Problem3 {


    private static final Logger logger = LoggerFactory.getLogger(Problem3.class);

    /**
     * 프로그램 진행.
     */
    public static void problem3() {

        int[] arr = makeArray();

        int []arr2= arr;
        int []arr3= arr;

        arraysSortTime(arr2);
        selectionSortTime(arr3);

    }

    /**
     * 자바에서 제공되는 sort알고리즘 사용.
     *
     * @param arr 정렬할 배열.
     */
    public static void arraysSortTime(int[] arr) {
        long curLong = System.currentTimeMillis();
        Arrays.sort(arr);
        long endLong = System.currentTimeMillis();
        logger.info("걸린 시간 {}", (endLong - curLong) / 1000);
    }

    /**
     * 커스텀하게 만든 선택정렬 알고리즘 사용.
     *
     * @param arr 정렬할 배열.
     */
    public static void selectionSortTime(int[] arr) {
        long curLong = System.currentTimeMillis();
        selectionSrot(arr);
        long endLong = System.currentTimeMillis();
        logger.info("걸린 시간 {}", (endLong - curLong) / 1000);
    }

    /**
     * 선택정렬 알고리즘 , 오름차순 정렬.
     *
     * @param arr 정렬할 배열.
     */
    public static void selectionSrot(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx]; //가장 작은 idx
            arr[idx] = temp; // swap
        }
    }

    /**
     * Problem 5를 위한 오버로딩.
     *
     * @param arr   정렬할 배열.
     * @param range 범위 .
     */
    public static void selectionSrot(int[] arr, int range) {

        for (int i = 0; i < range - 1; i++) {
            int min = arr[i];
            int idx = i;
            for (int j = i + 1; j < range; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx]; //가장 작은 idx
            arr[idx] = temp; // swap
        }
    }


    /**
     * 배열을 자동으로 생성함.
     *
     * @return 배열.
     */
    public static int[] makeArray() {

        int[] arr = new int[200000];
        for (int i = 0; i < 200000; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        return arr;
    }

}
