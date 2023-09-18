package org.nhnacademy.minju;

import java.util.Random;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * .Write a function that takes an array of type int[][] as a parameter,
 *  and returns the transpose of that array
 */
public class Exercise2 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise2.class);

    /**
     * .M[R][C]
     */
    public static void exercise2() {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] m = new int[r][c];

        makeArray(m);
        printArray(m);
        int[][] temp = transpose(m);
        printArray(temp);
    }

    private static void makeArray(int[][] array) {
        logger.info("array : ");

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    /**
     * .T[i][j] == M[j][i]
     *
     * @param array array[i][j]
     * @return array[j][i]
     */
    private static int[][] transpose(int[][] array) {
        logger.info("transpose array : ");

        int[][] temp = new int[array[0].length][array.length];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[0].length; i++) {
                temp[i][j] = array[j][i];
            }
        }
        return temp;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            logger.info("{}", array[i]);
        }
    }
}
