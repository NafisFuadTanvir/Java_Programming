package Problems;

import java.util.Scanner;

public class Problem_F {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<a.length;i++){
             a[i]= sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
            if(a[i]==3)
            {
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
    }
}
