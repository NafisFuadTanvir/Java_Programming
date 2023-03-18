package BinarySearch;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the size of array:-");
        int n= input.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the numbers:- ");
        for(int i=0;i< arr.length; i++){
            arr[i]=input.nextInt();
        }
        System.out.println("enter the search element:-");
        int searchelemnet= input.nextInt();
        int left= 0;
        int right=arr.length-1;
        int c=0;


        while(left<=right){
            int mid=(right+left)/2;

            if(searchelemnet==arr[mid]){
                System.out.println("element found in index:-"+ mid);
                break;
            }
            else if(searchelemnet>arr[mid]){
                left=mid+1;
                //System.out.println("element found in index:-"+ arr[left]);

            }
            else{
                right= mid-1;
                //System.out.println("element found in index:- "+ arr[right]);

            }
            c++;

        }
        System.out.println(c);
        if(left>right){
            System.out.println("element not found");
        }


    }
}