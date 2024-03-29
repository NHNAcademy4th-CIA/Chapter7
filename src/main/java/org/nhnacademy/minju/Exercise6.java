package org.nhnacademy.minju;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * .Write a program that will read a text file selected by the user,
 * and will make an alphabetical list of all the different words in that file.
 */
public class Exercise6 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise6.class);

    /**
     * .check character isLetter or apostrophes
     * eliminate duplicates using set,
     * sort arrayList
     */
    public static void exercise6() {
        Map<String, Integer> map = new TreeMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/temp.txt"))) {
            String row;
            while ((row = bufferedReader.readLine()) != null) {
                StringBuilder sb;
                StringTokenizer st = new StringTokenizer(row);

                while (st.hasMoreTokens()) {
                    sb = new StringBuilder();
                    for (char ch : st.nextToken().toCharArray()) {
                        if (Character.isLetter(ch)) {
                            sb.append(Character.toLowerCase(ch));
                        } else if (ch == '\'' && sb.length() > 0) {
                            sb.append(ch);
                        }
                    }
                    if (sb.length() > 0) {
                        map.put(sb.toString(), 1);
                    }
                }
            }
        } catch (IOException e) {
            logger.warn("{}", e.getMessage());
        }
        for (var str : map.keySet()) {
            logger.info("{}", str);
        }
    }

//    private static void sortArray(HashMap<String, Integer> arrayList) {
//        for (int i = arrayList.size() - 1; i > 0; i--) {
//            int maxLoc = 0;
//            for (int j = 1; j <= i; j++) {
//                if (arrayList.get(j).compareTo(arrayList.get(maxLoc)) >= 0) {
//                    maxLoc = j;
//                }
//            }
//            String temp = arrayList.get(maxLoc);
//            arrayList.set(maxLoc, arrayList.get(i));
//            arrayList.set(i, temp);
//        }
//    }
}
