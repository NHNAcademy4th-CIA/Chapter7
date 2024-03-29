package org.nhnacademy.minju;

import java.util.Arrays;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * .custom 정렬과 Arrays.sort의 각각 걸리는 시간을 비교하는 프로그램
 */
public class Exercise3 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise3.class);

    /**
     * .충분히 큰 배열에 대해 정렬을 진행한다.
     */
    public static void exercise3() {

        int[] array = new int[2_147];
        makeArray(array);

        calcTimeInSelectionSort(array);
        calcTimeInArraySort(array);
    }

    private static void calcTimeInSelectionSort(int[] array) {
        long startTime;
        long endTime;
        long compTime;
        double seconds;

        startTime = System.nanoTime();
        selectionSort(array);
        endTime = System.nanoTime();
        compTime = endTime - startTime;
        seconds = compTime / 1000000000.0;
        logger.info("Run time in nanoseconds was: {}", compTime);
        logger.info("Run time in seconds was: {}", seconds);
    }

    private static void calcTimeInArraySort(int[] array) {
        long startTime;
        long endTime;
        long compTime;
        double seconds;

        startTime = System.nanoTime();
        Arrays.sort(array);
        endTime = System.nanoTime();
        compTime = endTime - startTime;
        seconds = compTime / 1000000000.0;
        logger.info("Run time in nanoseconds was: {}", compTime);
        logger.info("Run time in seconds was: {}", seconds);
    }

    private static void makeArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    static void selectionSort(int[] A) {
        // Sort A into increasing order, using selection sort

        for (int lastPlace = A.length - 1; lastPlace > 0; lastPlace--) {
            // Find the largest item among A[0], A[1], ...,
            // A[lastPlace], and move it into position lastPlace
            // by swapping it with the number that is currently
            // in position lastPlace.

            int maxLoc = 0;  // Location of largest item seen so far.

            for (int j = 1; j <= lastPlace; j++) {
                if (A[j] > A[maxLoc]) {
                    // Since A[j] is bigger than the maximum we've seen
                    // so far, j is the new location of the maximum value
                    // we've seen so far.
                    maxLoc = j;
                }
            }

            int temp = A[maxLoc];  // Swap largest item with A[lastPlace].
            A[maxLoc] = A[lastPlace];
            A[lastPlace] = temp;

        }  // end of for loop

    }
}
