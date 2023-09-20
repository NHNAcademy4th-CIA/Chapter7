package org.nhnacademy.minju;

import java.util.ArrayList;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * .Write a program that will read a sequence of positive real numbers
 * entered by the user and will print the same numbers in sorted order
 * from smallest to largest.
 */
public class Exercise5 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise5.class);

    /**
     * .input to arrayList, then sort arrayList
     */
    public static void exercise5() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int input;
        do {
            input = scanner.nextInt();
            arrayList.add(input);
        } while (input != 0);
        sortArray(arrayList);
        logger.info("{}", arrayList);
    }

    private static void sortArray(ArrayList<Integer> arrayList) {
        for (int i = arrayList.size() - 1; i > 0; i--) {
            int maxLoc = 0;
            for (int j = 1; j <= i; j++) {
                if (arrayList.get(j) > arrayList.get(maxLoc)) {
                    maxLoc = j;
                }
            }
            int temp = arrayList.get(maxLoc);
            arrayList.set(maxLoc, arrayList.get(i));
            arrayList.set(i, temp);
        }
    }
}
