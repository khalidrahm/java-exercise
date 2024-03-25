package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1};
        ArrayList<Integer> duplicated = removeDuplicate(arr);
        System.out.println(duplicated);

    }
    public static ArrayList<Integer> removeDuplicate(int[] arra){
        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> uniqueArr = new ArrayList<>();
        for(int i=0;i<arra.length;i++){
            if (!map.containsKey(arra[i])){
                map.put(arra[i], true);
                uniqueArr.add(arra[i]);
            }else{
                map.put(arra[i], true);
            }
        }
        return uniqueArr;
    }
}
