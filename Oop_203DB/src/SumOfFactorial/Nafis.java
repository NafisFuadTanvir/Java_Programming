
import java.util.Scanner;
public class Nafis {


        public static void main(String[] args) {
            System.out.println("Enter any number: ");
            Scanner num= new Scanner(System.in);
            int n = num.nextInt();
            int i=0,c=0;
            for(i=1;i<=n;i++){
                for(c=1;c<=2*n;c++){
                    if(c<=i||c>(2*n-i)){
                        System.out.print("* ");
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println(" ");
            }
        }

    }

