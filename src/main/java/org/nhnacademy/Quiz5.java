package org.nhnacademy;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quiz5 {
   public Quiz5(){
       new CustomSort();
   }
}

class CustomSort {
    private Scanner scanner = new Scanner(System.in);
    private static Logger logger = LoggerFactory.getLogger(Quiz5.class);
    public CustomSort() {

        double[] numbers;
        int numCount;
        double num;

        numbers = new double[100];
        numCount = 0;

        System.out.println("100개의 양의실수를 입력하라. 끝내고싶으면 0을 입력하라");

        while ((num=scanner.nextDouble())!=0) {
            numbers[numCount] = num;
            numCount++;
        }

        selectSort(numbers, numCount);

        logger.info("정렬된 값 : ");

        for(double n:numbers)
        {
            logger.info("{}",n);
        }

    }
    static void selectSort(double[] A, int count) {
        for ( int lastIndex = count - 1; lastIndex > 0; lastIndex-- ) {
            int maxIndex = 0;
            for (int j = 1; j <= lastIndex; j++) {
                if (A[j] > A[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = A[maxIndex];
            A[maxIndex] = A[lastIndex];
            A[lastIndex] = temp;
        }
    }

}