package ThreadPractise;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=1,b=1,c=0;
        int n= sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        while(c<=n){
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
