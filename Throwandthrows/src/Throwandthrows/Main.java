package Throwandthrows;

public class Main {
    static void chekAge(int a){
        if(a<18){
            throw new ArithmeticException("Excess denied for vote");
        }else{
            System.out.println("excess granted for giving vote");
        }
    }

    public static void main(String[] args) {
        try{
            chekAge(2);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the code");

    }
}
