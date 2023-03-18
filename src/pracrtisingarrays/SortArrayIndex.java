package pracrtisingarrays;
import java.util.Scanner;
import java.util.Arrays;
public class SortArrayIndex {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("enter the inputs:- ");
        for(int i=0;i<5;i++)
        {
             arr[i]= input.nextInt();
        }
        System.out.println("print :- ");
        System.out.println(Arrays.toString(arr));
        System.out.println("after swap:- ");

        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
