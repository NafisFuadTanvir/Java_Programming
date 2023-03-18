package p;

import java.sql.SQLOutput;
import java.util.Scanner;

class function{
    public static int findmax(int a[]){

        int max=a[0];
        for(int j=0;j<a.length;j++){
            if(a[j]>max){
                max=a[j];
            }
        }
        System.out.println(max);
        return  a[max];
    }

}
public class Main{
    public static void main(String[] args) {
          int a[]={};
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        function my= new function();
        function.findmax(a[]);
}
}
