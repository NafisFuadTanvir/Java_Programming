package LabFinalPractise;

public class UserDefinedException extends Exception{
   public UserDefinedException(String str){
          super(str);
    }
}
class Test2{
    public static void main(String[] args) {
        try{
            throw new UserDefinedException("this is user defined exception");
        }catch(UserDefinedException e){
            System.out.println("caught the exception");
        }
    }
}
