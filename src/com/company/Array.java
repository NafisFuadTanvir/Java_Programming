package com.company;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int nafis[]={10,15,10,50,70,80,50};
        System.out.println("enter the size:- ");
        int n=input.nextInt();
        int i;
        for(i=0;i<n;i++)
        {

            System.out.println(nafis[i]);
        }
    }
}
