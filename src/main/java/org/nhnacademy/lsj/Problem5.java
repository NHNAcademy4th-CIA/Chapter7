package org.nhnacademy.lsj;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem5 {

    private static final Logger logger = LoggerFactory.getLogger(Problem5.class);

    public static void problem5() {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];


        int num;
        int count = 0;

        for (int i = 0; i < 100; i++) {
            count = i;
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            arr[i] = num;
        }
        Problem3.selectionSrot(arr, count);
        printArray(arr,count);

    }


    public static void printArray(int[] arr, int count) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        for (int i = 0; i < count; i++) {
            sb.append(arr[i]).append(" ");
        }
        sb.append("\n");
        logger.info(sb.toString());

    }


}
