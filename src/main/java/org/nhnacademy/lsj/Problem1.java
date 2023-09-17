package org.nhnacademy.lsj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1부터 지정된 최대값까지의 범위에 있는 여러 가지 임의의 정수를 포함하는 ArrayList를 생성하는 서브루틴을 작성하세요 .
 */
public class Problem1 {


    private static final Logger logger = LoggerFactory.getLogger(Problem1.class);

    /**
     * 프로그램 진행.
     */
    public static void problem1() {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        list = rangeInput(sc.nextInt());

        for (int i = 0; i < list.size(); i++) {
            logger.info("{}번째 숫자 {}", i + 1, list.get(i));
        }
    }

    /**
     * 1~max까지의 수를 무작위로 입력.
     *
     * @param max 최대 범위.
     * @return List.
     */
    public static List<Integer> rangeInput(int max) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            list.add((int) (Math.random() * max + 1));
        }
        return list;

    }


}
