package com.company;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the fruit name:- ");
        String fruit= input.next();
        switch (fruit) {
            case "apple" -> System.out.println("a red fruit");
            case "banana" -> System.out.println("a yellow fruit");
            case "goava" -> System.out.println("a green fruit");
            case "jackfruit" -> System.out.println("national fruit");
            default -> System.out.println("enter the valid name");
        }
          int day=input.nextInt();
        switch (day)
        {
            case 1 ->System.out.println("satarday");
            case 2 ->System.out.println("sunday");
            case 3 ->System.out.println("monday");
            case 4 ->System.out.println("tuesday");
            case 5 -> System.out.println("wednesday");
            case 6 ->System.out.println("thurstday");
            case 7 ->System.out.println("friday");
        }



    }
}
