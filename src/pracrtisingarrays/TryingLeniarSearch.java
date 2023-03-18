import java.util.Scanner;
public class TryingLeniarSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element of this array:- ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the item you want to search:- ");
        int searchitem = input.nextInt();
        for (int i = 0; i < size; i++) {
            if (searchitem == arr[i]) {
                System.out.println("item is:- " + searchitem + " and position: " + i);
               break;
            }
        }
        System.out.println("item not found");
        }

        }

