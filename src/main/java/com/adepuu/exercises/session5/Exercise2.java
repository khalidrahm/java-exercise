package com.adepuu.exercises.session5;
import java.util.Arrays;
public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        int arr[] = {7,2,5,1,4};
        int d = 2;
        int[] rotated = rotate(arr,d);
        System.out.println(Arrays.toString(rotated));
    }
    public static int[] rotate(int[] arra, int distance){
        int [] rotatedArr = new int[arra.length];
        for(int i = 0; i< arra.length;i++){
            int newIndex = (i+arra.length-distance)%(arra.length);
            rotatedArr[newIndex] = arra[i];
        }
        return rotatedArr;
    }
}
