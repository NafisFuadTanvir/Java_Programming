package Problems;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter the number:- ");
            int n= in.nextInt();
            int count=0;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("This is prime Number");
            }else{
                System.out.println("This is not Prime");
            }

        }

    }
}
