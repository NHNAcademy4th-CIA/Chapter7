package org.nhnacademy.lsj;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 2차원 배열을 생성하고 그것의 전치 배열을 출력해라.
 */
public class Problem2 {


    private static final Logger logger = LoggerFactory.getLogger(Problem2.class);

    /**
     * 행렬의 크기를 입력받음 , 전치행렬 출력.
     */
    public static void problem2() {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int R = sc.nextInt();

        int[][] arr = new int[M][R];

        initArray(arr);

        printArray(arr);

        int[][] answer = transPosition(arr);
        printArray(answer);


    }

    /**
     * 행렬을 출력함.
     *
     * @param arr 행렬.
     */
    public static void printArray(int[][] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        logger.info(sb.toString());
    }

    /**
     * 행렬을 자동으로 생성.
     *
     * @param arr 행렬.
     */
    public static void initArray(int[][] arr) {

        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
                num++;
            }
        }

    }

    /**
     * 행렬을 전치행렬로 만듦 , 전치행렬 = arr[i][j]= arr2[j][i].
     *
     * @param arr 기준이 되는 행렬.
     * @return arr의 전치행렬.
     */
    public static int[][] transPosition(int[][] arr) {

        int C = arr.length;
        int R = arr[0].length;
        int[][] result = new int[C][R];

        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                result[i][j] = arr[j][i];
            }
        }
        return result;
    }


}
