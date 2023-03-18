package Problems;

import java.util.Scanner;

public class FibonnaciDemo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter how many numbers you want?");
        int n= in.nextInt();
        int first=0,second=1,fibo;
        System.out.print(first);
        System.out.println(second);

        for(int i=3;i<=n;i++);
        {
            fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;

        }
        System.out.println();
    }
}
