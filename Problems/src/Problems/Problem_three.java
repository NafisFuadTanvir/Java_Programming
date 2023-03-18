package Problems;
import java.util.Scanner;
public class Problem_three {

     public static int compareTriplets(int[] a,int[] b){
  for(int i=0;i<3;i++){
      if(a[0]>b[0])
          return 1;

      else if(a[1]==b[1])
          return 0;

      else if(a[2]<b[2])
          return 1;

  }
 return 1;


     }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int[] a= {17 ,28 ,30};
            int[] b ={99 ,16, 8};
        compareTriplets(a,b);


    }
}
