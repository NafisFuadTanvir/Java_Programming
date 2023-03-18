package LabFinalPractise;

public class ThrowsKeyWord {
    void run()throws ArithmeticException{
        throw new ArithmeticException("vul uttor");
    }
}
class M{
    public static void main(String[] args) {
        ThrowsKeyWord t= new ThrowsKeyWord();
        t.run();
    }

}