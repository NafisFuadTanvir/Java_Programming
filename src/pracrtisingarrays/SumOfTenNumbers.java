import java.util.Scanner;
public class SumOfTenNumbers {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        System.out.print("enter the array size:- ");
        int n= input.nextInt();
        int[] number= new int[n];
        int i;
        int sum=0;
        System.out.println("enter the number for the array:- ");
        for(i=0;i<n;i++)
        {
            number[i]= input.nextInt();
            sum=sum+number[i];
        }
        System.out.println("the sum of 10 numbers are:- " +sum);

         int avg= sum/n;

        System.out.println("the avarage is:-\n" + avg);

    }
}
