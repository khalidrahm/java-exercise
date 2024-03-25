package com.adepuu.exercises.session5;
import java.util.ArrayList;
public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        int [] list = {1,2,1,3,5,1};
        int key = 1;
        ArrayList<Integer> removed = removeKey(list, key);
        System.out.println(removed);


    }
    public static ArrayList<Integer> removeKey(int[] arra, int ki){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arra.length; i++){
            if (!(arra[i]==ki)){
                list.add(arra[i]);
            }
        }return(list);

    }
}
