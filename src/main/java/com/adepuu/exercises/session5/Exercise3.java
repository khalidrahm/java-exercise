package com.adepuu.exercises.session5;
import  java.util.HashMap;
public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3};
        boolean duplicated = checkDuplicate(arr);
        System.out.println(duplicated);


    }

    public static boolean checkDuplicate(int[] arra){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<arra.length;i++){
            if (!map.containsKey(arra[i])){
                map.put(arra[i], true);
            }else{
                return true;
            }
        }
        return false;
    }
}
