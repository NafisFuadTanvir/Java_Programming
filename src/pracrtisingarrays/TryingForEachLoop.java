import java.util.Scanner;
public class TryingForEachLoop {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        int[] numbers= {10,15,20,30};
        int sum=0;

        for(int x : numbers)
        {
            sum=sum+x;

        }
        System.out.println("The sum is:- "+sum);

        String[] names= {"Tanvir","jamilur","samiduzzaman"};
          for(String x: names)
          {
              System.out.println(names);
          }
    }
}
