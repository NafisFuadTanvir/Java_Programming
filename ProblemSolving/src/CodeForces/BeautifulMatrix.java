package CodeForces;

import java.util.Scanner;

import static java.lang.Math.abs;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int i,j,c=0;
        Scanner in= new Scanner(System.in);
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                c=in.nextInt();
                if(c==1){
                    System.out.println(abs(i-3)+abs(j-3));
                }
            }
        }
    }
}
