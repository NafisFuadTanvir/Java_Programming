package Throwandthrows;

public class PractiseThrows {
    static int mymethod(int a, int b) throws ArithmeticException{
        int result=a/b;
        return  result;
    }

    public static void main(String[] args) {
        try{
            //mymethod(20,0);
            System.out.println(mymethod(20,0));
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
