package Oop_203DB;
import java.util.*;
public class FivonacciNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int a=0, b=1, c;
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }
    }

}
