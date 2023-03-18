package Oop_203DB;
import java.util.*;
public class FactorialRecursion {
    static int facto(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n*facto(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int result= facto(input.nextInt());
        System.out.println("The factorial of this number is:- "+result);

    }
}
