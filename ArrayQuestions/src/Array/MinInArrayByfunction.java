package Array;

public class MinInArrayByfunction {
    public static void main(String[] args) {
        int[] a= {10,20,30,60,80,8};
        System.out.println("the minimum number is:- "+minNumber(a));
    }
    static int minNumber(int b[]){
        int min=b[0];
        for (int i=1;i<b.length;i++){
            if(min>b[i]){
                min= b[i];
            }
        }
        return min;
    }
}
