package LabFinalPractise;
import java.io.*;

public class Exception extends Throwable {
    public Exception(String str) {

    }

    public static void main(String[] args) {

       try{
           int[] a=new int[5];
           a[10]=30/0;
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }catch(ArithmeticException e){
           System.out.println(e);}
       catch(java.lang.Exception e){
           System.out.println("another exceeption occurs");
       }
        System.out.println("rest of the code");

    }
}
