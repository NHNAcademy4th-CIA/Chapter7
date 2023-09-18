package org.nhnacademy.minju;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * .Write a subroutine that creates an ArrayList
 * containing several different random integers in the range
 * from 1 up to some specified maximum.
 */
public class Exercise1 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise1.class);

    /**
     * .input max range
     */
    public static void exercise1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxRange = scanner.nextInt();
        logger.info("{}", makeArrayList(random.nextInt(10), maxRange));
        logger.info("{}", makeArrayList(random.nextInt(10), maxRange));
        logger.info("{}", makeArrayList(random.nextInt(10), maxRange));
    }

    private static ArrayList<Integer> makeArrayList(int arrayLength, int maxRange) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            arrayList.add(random.nextInt(maxRange) + 1);
        }
        return arrayList;
    }
}
