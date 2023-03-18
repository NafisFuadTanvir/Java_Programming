package LabFinalPractise;
class Methods{
    static int taka(int a,int b){
        return a+b;
    }
    static int taka(int a,int b,int c){
        return a+b+c;
    }
    static double taka(double a, double b){
        return a+b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Methods.taka(100,500)+" "+Methods.taka(1000,80,900)+" "+ Methods.taka(41.5,50.6));




    }

}
