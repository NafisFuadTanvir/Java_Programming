import java.util.Scanner;
public class Userinputarray {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        double[] numbers= new double[5];
      int i;
       for(i=0;i<5;i++)
      {
            numbers[i]= input.nextDouble();
            System.out.println(numbers[i]);
        }
        String[] names= new String[10];
           int j;
           for(j=0;j<10;j++)
           {
               names[j]=input.nextLine();
               System.out.println("the strings are" +" "+names[j]);
           }



    }
}
