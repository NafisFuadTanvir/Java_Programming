package com.company;
import java.util.Scanner;
public class Onenumbinint {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number:-");
        int numb= input.nextInt();
        System.out.println("enter the number you want to check:-");
        int check= input.nextInt();
        int count=0;
        while(numb>0)
        {
            int rem=numb%10;
            if(numb==check)
            {
                count++;
            }
            numb=numb/10;

        }
        System.out.println(count);

    }
}
