package LabFinalPractise;

public class ThrowKeyWord {

    int ageCheck(int age){
        if(age<18){
            throw  new ArithmeticException("you are not allow to vote");
        }else{
            System.out.println("you can vote");
        }
        return age;
    }
    public static void main(String[] args) {
        ThrowKeyWord t= new ThrowKeyWord();
        t.ageCheck(13);

    }
}
