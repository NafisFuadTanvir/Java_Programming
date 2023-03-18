package LabFinalPractise;
interface one{
    void write();
}
interface two{
    void show();
}
public class Multipleinheritance implements one,two {
    public void write(){
        System.out.println("i am writing");
    }
    public void show(){
        System.out.println("i am showing");
    }

    public static void main(String[] args) {
        Multipleinheritance m1= new Multipleinheritance();
        m1.write();
        m1.show();
    }
}
