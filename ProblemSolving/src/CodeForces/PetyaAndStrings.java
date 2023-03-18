package CodeForces;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String one= in.nextLine();
        String two= in.nextLine();
        for(int i=0;i<one.length();i++){
            one[i]= main(one[i]);
            two[i]= main(two[i]);
        }




        if(one.length()<two.length()){
            System.out.println(-1);
        }else if(two.length()<one.length()){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
