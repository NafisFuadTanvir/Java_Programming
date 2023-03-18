import java.util.Scanner;
public class FindMaxMin {
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter the size of the array:-");
    int size= input.nextInt();
    int[] array= new int[size];
    int i;
    System.out.println("Enter the number you want to add in this array:-");
    for(i=0;i<size;i++)
    {
      array[i]= input.nextInt();
    }
    int max= array[0];
    for(i=1;i<size;i++)
    {
      if(array[i]>max)
      {
        max=array[i];
      }
    }
    System.out.println("the maximum number is:-\n" + max);
    int min= array[0];
    for(i=1;i<size;i++)
    {
      if(array[i]<min)
      {
        min= array[i];
      }
    }
    System.out.println("the minimum number is:-\n" + min);

  }

}
