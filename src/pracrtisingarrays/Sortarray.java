import java.util.Scanner;
import java.util.Arrays;
public class Sortarray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr= new int[10];
        System.out.println("enter the numbers of the array:- ");
        int i;
        for(i=0;i<10;i++)
        {
            arr[i]= input.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
