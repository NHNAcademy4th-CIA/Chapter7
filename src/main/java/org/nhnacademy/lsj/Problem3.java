package org.nhnacademy.lsj;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem3 {


    private static final Logger logger = LoggerFactory.getLogger(Problem3.class);

    public static void problem3(){

        int []arr=makeArray();
        int []arr2=makeArray();

        arraysSortTime(arr);
        selectionSortTime(arr2);

    }

    public static void arraysSortTime(int[]arr){
        long curLong = System.currentTimeMillis();
        Arrays.sort(arr);
        long endLong = System.currentTimeMillis();
        logger.info("걸린 시간 {}",(endLong-curLong)/1000);
    }

    public static void selectionSortTime(int[]arr){
        long curLong = System.currentTimeMillis();
        selectionSrot(arr);
        long endLong = System.currentTimeMillis();
        logger.info("걸린 시간 {}",(endLong-curLong)/1000);
    }

    public static void selectionSrot(int[]arr){

        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(min<arr[j]){
                    min=arr[j];
                    idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[idx];//가장 작은 idx
            arr[idx]=temp; // swap
        }
    }

    public static int[] makeArray(){

        int[]arr= new int[100000];
        for(int i=0;i<100000;i++){
            arr[i]=(int)(Math.random()*100+1);
        }
        return arr;
    }

}
