package org.nhnacademy.lsj;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem2 {

    private static final Logger logger = LoggerFactory.getLogger(Problem2.class);

    public static void problem2(){

        Scanner sc = new Scanner(System.in);

        int M=sc.nextInt();
        int R=sc.nextInt();

        int [][]arr= new int[M][R];

        initArray(arr);

        printArray(arr);

        int [][]answer=transPosition(arr);
        printArray(answer);


    }

    public static void printArray(int[][]arr){
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        logger.info(sb.toString());
    }
    public static void initArray(int [][]arr){

        int num=1;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=num;
                num++;
            }
        }

    }

    public static int[][] transPosition(int [][]arr){

        int C= arr.length;
        int R=arr[0].length;
        int [][]result= new int[C][R];

        for(int i=0;i<C;i++){
            for(int j=0;j<R;j++){
                result[i][j]=arr[j][i];
            }
        }
        return result;
    }


}
