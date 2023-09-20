package org.nhnacademy.lsj;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 사용자가 만든 커스텀 정렬을 사용하기.
 */
public class Problem5 {

    private static final Logger logger = LoggerFactory.getLogger(Problem5.class);

    /**
     * 프로그램 진행.
     */
    public static void problem5() {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];


        int num;
        int range = 0;

        for (int i = 0; i < 100; i++) {
            range = i;
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            arr[i] = num;
        }
        Problem3.selectionSrot(arr, range); // 선택정렬
        printArray(arr, range);

    }


    /**
     * 배열 출력 , StringBuilder 사용.
     *
     * @param arr   출력할 배열.
     * @param range 출력할 범위.
     */
    public static void printArray(int[] arr, int range) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        for (int i = 0; i < range; i++) {
            sb.append(arr[i]).append(" ");
        }
        sb.append("\n");
        logger.info(sb.toString());

    }


}
