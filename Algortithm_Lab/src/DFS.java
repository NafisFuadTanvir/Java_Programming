import java.util.*;
public class DFS {

    static char[] c={'a','b','c','d','e','f','g','s'};
    static int[] e={2,2,2,2,2,2,3,3};
    static int list[][]={
            {3,7},
            {4,7},
            {5,7},
            {0,6},
            {1,6},
            {2,6},
            {3,4,5},
            {0,1,2}
    };
    static int checked[]= new int[20];
   static Stack<Integer> s= new Stack<>();
     static int top=0;
     static int notChecked(int n){
if(checked[n]==1){
    return 0;
}
return 1;
     }
    public static void main(String[] args) {
         int i,n = 0,f=0;
         s.push(7);
        while(top!=0){
            n= s.get(top - 1);
            for(i=0; i<e[n];i++){
                f=0;
                if(notChecked(list[n][i])==1){
                    s.push(list[n][i]);
                    System.out.print(c[n]+" ");
                    f=1;
                    break;

                }
                if(f==0){
                    s.pop();
                    System.out.print(c[s.get(top-1)] +" ");
                }
            }
            
        }

    }


}
