package com.company;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
        for(i=0;i<10;i++)
        {
            System.out.println("i am the boss in java programm");
        }
        System.out.println("enter the number for ceclcious:-");
        float tempinc=input.nextFloat();
        float tempinf= (tempinc * 9/5)+32;
        System.out.println(tempinf);

    }
}
