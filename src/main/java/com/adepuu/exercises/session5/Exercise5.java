package com.adepuu.exercises.session5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = “asc”
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = “desc”
     * Output: [ 8,7, 5, 2 ]
     */
    public static void main(String[] args) {
        int[] arr = {8,7,5,2,3};
        String direction = "asc";
        ArrayList<Integer> sorted = sortArray(arr, direction);
        System.out.println(sorted);

    }
    public static ArrayList<Integer> sortArray(int[] arr, String dir){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<arr.length;i++) {
            list.add(arr[i]);
        }
        if (dir=="desc"){
            Arrays.sort(arr);
            Collections.sort(list, Collections.reverseOrder());
        }else if(dir=="asc"){
            Collections.sort(list);
        }
        return list;
    }
}
