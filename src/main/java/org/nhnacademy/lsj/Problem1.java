package org.nhnacademy.lsj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem1 {


    private static final Logger logger = LoggerFactory.getLogger(Problem1.class);

    public static void problem1() {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        list = rangeInput(sc.nextInt());

        for (int i = 0; i < list.size(); i++) {
            logger.info("{}번째 숫자 {}", i + 1, list.get(i));
        }
    }

    public static List<Integer> rangeInput(int max) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            list.add(i);
        }
        return list;

    }


}
