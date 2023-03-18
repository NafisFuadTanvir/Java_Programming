package com.company;
import java.util.Scanner;

public class Takeuserinput {
    public static void main(String[] args) {
        System.out.println("Take input from user");
        Scanner nafis= new Scanner(System.in);
        System.out.println("enter the first number");
        //int a= nafis.nextInt();
        float a= nafis.nextFloat();
        System.out.println("enter the second number");
        //int b= nafis.nextInt();
        float b = nafis.nextFloat();
        System.out.println("the sum is:-");
        System.out.println(a+b);
        System.out.println("enter the name:-");
      String na= nafis.nextLine();
        System.out.println(na);





    }
}
