package pracrtisingarrays;
import java.util.Scanner;
import java.util.Arrays;

public class FindMaxWithfunction {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int [] arr= new int[10];
        System.out.println("enter the items:- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("The maximum value is "+ returnMAx(arr));
        System.out.println();
        System.out.println("The minimum number is "+returnMin(arr));
    }
    static int returnMAx(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int returnMin(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

}
