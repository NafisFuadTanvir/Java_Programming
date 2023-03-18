package Oop_203DB;
import java.util.Scanner;

public class MultipelsOfThreeAndFive {
     static void findMultiples(int n){
         int total=0;
        for(int i = 0; i <= n; i++)
            if(i % 3 == 0 && i % 5 == 0)
                total=total+i;
                System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number n:- ");
        findMultiples(input.nextInt());

    }

}


