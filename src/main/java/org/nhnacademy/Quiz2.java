package org.nhnacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quiz2 {
    public Quiz2(){
        Logger logger = LoggerFactory.getLogger(Quiz1.class);

        int[][] arr = new int[][] {
                {1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3},
        };
        Array array = new Array(3,6);
        array.reverse(arr);
        for(int i=0;i<6;i++)
        {
            logger.info("{}",array.toString(i));
        }

    }

}
class Array{
    private int[][] array;
    public Array(int x, int y){
        array = new int[y][x];
    }
    public String toString(int i){
        StringBuilder stringBuilder = new StringBuilder();
        for(int num:array[i])
        {
            stringBuilder.append(num).append(" ");

        }
        return stringBuilder.toString();
    }
    public void reverse(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                array[j][i] = arr[i][j];
            }
        }
    }
}