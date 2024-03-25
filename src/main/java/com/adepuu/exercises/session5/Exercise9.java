package com.adepuu.exercises.session5;
import java.util.ArrayList;
import  java.util.Arrays;

public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     *
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     *
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     *
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */
    public static void main(String[] args) {
        int[] temperatures1 = {73,74,75,71,69,72,76,73};
        ArrayList<Integer> result1 = dailyWaitDays(temperatures1);
        System.out.println(result1);

    }

    public static ArrayList<Integer> dailyWaitDays(int[] arra) {
        ArrayList<Integer> dailyWait = new ArrayList<>();
        for(int i = 0; i<arra.length;i++){

            boolean foundWarmerDay = false;

            int j = i+1;


            while(!foundWarmerDay&&(j<arra.length)){

                if(arra[j]>arra[i]){
                    
                    dailyWait.add(j-i);
                    foundWarmerDay = true;

                }
                j=j+1;
            }if (!foundWarmerDay) {
                dailyWait.add(0);
            }
        }return dailyWait;



    }
}
