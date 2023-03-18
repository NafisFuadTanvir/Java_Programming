package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a={10,12,13,15,7,8,6,2};
        System.out.println("Enter the element you want to search:- ");
        int element= sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(element==a[i]){
                System.out.println("item found at index number:-"+ i);
                break;
            }
        }


    }
}
