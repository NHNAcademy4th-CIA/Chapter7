package org.nhnacademy.lsj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 텍스트 파일을 읽음 , 단어 단위로 읽음 , 모든 단어는 소문자로 변경 ,  '를 허용함 .
 */
public class Problem6 {

    private static final Logger logger = LoggerFactory.getLogger(Problem6.class);


    /**
     * 버퍼리더로 파일 읽기, 토큰라이저로 공백 제거 , 단어별로 list 추가.
     *
     * @throws FileNotFoundException exception controll.
     */
    public static void problem6() throws FileNotFoundException {


        List<String> list = new ArrayList<>();

        Map<String, Integer> m = new TreeMap<>();


        try { // 한 줄 씩 읽어

            File file = new File("src/main/resources/lsj.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(line);  // 공백 뛰고 읽을게
                while (stk.hasMoreTokens()) { // 단어 단위로 쪼갤게

                    StringBuilder result = new StringBuilder();

                    String temp = stk.nextToken();
                    for (int i = 0; i < temp.length(); i++) {
                        if (Character.isLetter(temp.charAt(i))) { // 문자만 넣어 , ' 있는 경우에는 합칠수도 있어
                            result.append(Character.toLowerCase(temp.charAt(i)));
                        } else if (temp.charAt(i) == '\'' && result.length() > 0) { // 어크스트로피면 , 앞에 문자있으면 합치면 됨
                            result.append(temp.charAt(i));
                        }
                    }

                    if (result.length() > 0) {
                        m.put(result.toString(), 1);
                    }
                }
            }


        } catch (IOException ex) {
            logger.error("에러입니다");
        }


        for (var string : m.keySet()) {
            logger.info(string);
        }


    }


}
