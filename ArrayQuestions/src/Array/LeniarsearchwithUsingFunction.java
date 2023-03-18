package Array;

import java.util.Scanner;

public class LeniarsearchwithUsingFunction {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] num={10,20,60,80,5,4,6,5,62};
        int searchFor= 5;
        int ans= leniarSearch(num,searchFor);
        System.out.println("item found at index number:-"+ ans);

    }
    static int leniarSearch(int[]a,int target){
        if(a.length==0){
            return -1;
        }
        for(int i=0;i<a.length;i++){
            if(target==a[i]){
                return i;
            }
        }

        return -1;
    }
}
