package org.nhnacademy.leejungbum;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quiz1 {
    Logger logger = LoggerFactory.getLogger(Quiz1.class);
    public Quiz1(){
        logger.info("{}",Random.createRandom(100,10));
    }
}
class Random{
    private Random(){

    }
    public static ArrayList<Integer> createRandom(int max,int count ) {
        if (count > max) {
            throw new IllegalArgumentException("최대 값 범위를 넘었습니다");
        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (numbers.size() < count) {
            int num = (int)(Math.random()*max) + 1;
            if ( numbers.indexOf(num) == -1 )
                numbers.add( num );
        }
        return numbers;
    }
}
