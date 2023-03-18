package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {100, 20, 690, 80, 60, 500, 200};
        System.out.println(Arrays.toString(arr));
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int a[], int index1, int index2) {

        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
    static void rev(int ar[]){
        int start=0;
        int end= ar.length-1;
        while(start<end){
            swap(ar,start,end);
            start++;
            end--;

    }
}}
