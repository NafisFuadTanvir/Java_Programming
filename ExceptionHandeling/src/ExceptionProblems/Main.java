package ExceptionProblems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true){
            try {
                Scanner in= new Scanner(System.in);
                System.out.print("please enter the first number:- ");
                int first= in.nextInt();
                System.out.print("please enter the first number:- ");
                int sec= in.nextInt();
                int result= first/sec;
                System.out.println("Result: "+"first"+"/"+"sec"+"="+result);
            } catch (Exception e) {
                System.out.println("Exception:-" +e);
                System.out.println("you must enter integer. please try again");
            }

        }

    }
}