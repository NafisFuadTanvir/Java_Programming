package SumOfFactorial;
import java.util.Scanner;
public class SumOfFactorial {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i=1,sum=0,fact=1;
        System.out.print("Enter the number:- ");
        int n=input.nextInt();
        while(i<=n)
        {
            fact=fact*i;
            sum=sum+fact;
            i++;
        }
        System.out.print("The summation of factorial is:- " +sum);

    }

}
