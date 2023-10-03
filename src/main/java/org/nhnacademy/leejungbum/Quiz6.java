package org.nhnacademy.leejungbum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quiz6 {
    public Quiz6(){
        new StringSort();
    }
}
class StringSort {
    private static Logger logger = LoggerFactory.getLogger(Quiz6.class);

    public StringSort() {

        Set<String> words = new HashSet<>();
        try {
            File file = new File("src/main/resources/input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            logger.info("정렬전");
            while ((line = br.readLine()) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                while (stringTokenizer.hasMoreTokens()) {

                    String temp = stringTokenizer.nextToken();
                    logger.info(temp);
                    words.add(temp.toLowerCase());
                }
            }
        } catch (IOException ex) {
            logger.error("에러");
        }

        List<String> list = new ArrayList<>(words);

        Collections.sort(list);
        logger.info("정렬후");
        for(String a : list) {
            logger.info(a);
        }

    }
}
