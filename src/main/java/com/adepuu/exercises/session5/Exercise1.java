package com.adepuu.exercises.session5;

public class Exercise1 {

    public static void main(String[] args){
        int arr[] = {7,2,5,1,4};
        int maximum = max(arr,0,arr.length-1);
        System.out.println(maximum);
    }

    public static int max(int[] arr, int start, int end){
        if (start==end){
            return arr[start];
        }
        int mid = (start+end)/2;
        int max1 = max(arr,start,mid);
        int max2 = max(arr,mid+1, end);
        if (max1>max2){
            return max1;
        }else{
            return max2;
        }

    }
}
