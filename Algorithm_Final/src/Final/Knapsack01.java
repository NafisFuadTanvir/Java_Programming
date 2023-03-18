package Final;

import java.util.*;
import java.io.*;
public class Knapsack01 {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int[] value= new int[n];
        int[] weight= new int[n];
        for(int i=0;i<value.length;i++){
            value[i]=in.nextInt();
        }
        for(int j=0;j< weight.length;j++){
            weight[j]= in.nextInt();
        }
        int capacity= in.nextInt();
        int[][] dp= new int[n+1][capacity+1];
        for(int i=1;i< dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(j>=weight[i-1]){
                    int remindercapacity= j-weight[i-1];
                    if(dp[i-1][remindercapacity]+ value[i-1]> dp[i-1][j]){
                        dp[i][j]=dp[i-1][remindercapacity]+value[i-1];
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                }else{
                    dp[i][j]=dp[i-1][j];
                }
                System.out.println(dp[n][capacity]);
            }
        }


    }
}

