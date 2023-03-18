package LabFinalPractise;

public class NestedException {
    public static void main(String[] args) {
        try{
            try{
                int a=100/0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int[] a=new int[5];
                System.out.println(a[10]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("rest of the code");
        }catch(java.lang.Exception e){
            System.out.println("all the exceptions are handeld");
        }finally {
            System.out.println("this must be exicuted");
        }
        System.out.println("normal flow");
    }
}
