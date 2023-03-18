import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number you want to check till prime:-");
        int n= s.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("This is prime number");
        }else{
            System.out.println("This is not prime");
        }
    }
}
