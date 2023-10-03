package org.nhnacademy.leejungbum;


import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quiz3 {
    Logger logger = LoggerFactory.getLogger(Quiz3.class);

    public Quiz3() {
        List<Integer> list = Random.createRandom(1000, 1);
        List<Integer> list2 = list;
        logger.info("선택정렬 시간 {} ", Sort.selectionSort(list2));
        logger.info("기본정렬 시간 {} ", Sort.arrSort(list));
    }
}

class Sort {
    private Sort() {

    }

    public static long arrSort(List<Integer> list) {
        long cTime = System.nanoTime();
        System.out.println(cTime);
        Arrays.sort(list.toArray());
        long eTime = System.nanoTime();
        System.out.println(eTime);

        return eTime - cTime;
    }

    public static long selectionSort(List<Integer> li) {
        long cTime = System.nanoTime();
        System.out.println(cTime);

        for (int i = 0; i < li.size() - 1; i++) {
            int min = li.get(i);
            int idx = i;
            for (int j = i + 1; j < li.size(); j++) {
                if (min > li.get(j)) {
                    min = li.get(j);
                    idx = j;
                }
            }
            int temp = li.get(i);
            li.set(i, li.get(idx));
            li.set(idx, temp);
        }
        long eTime = System.nanoTime();
        System.out.println(eTime);
        return eTime - cTime;

    }
}