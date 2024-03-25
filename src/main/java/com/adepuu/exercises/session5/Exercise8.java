package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,5,4};
        ArrayList<Integer> duplicated = checkDuplicate(arr);
        System.out.println(duplicated);

    }
    public static ArrayList<Integer> checkDuplicate(int[] arra){
        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> uniqueArr = new ArrayList<>();
        for(int i=0;i<arra.length;i++){
            if (!map.containsKey(arra[i])){
                map.put(arra[i], true);
            }else{
                uniqueArr.add(arra[i]);
                map.put(arra[i], false);
            }
        }
        return uniqueArr;
    }
}
