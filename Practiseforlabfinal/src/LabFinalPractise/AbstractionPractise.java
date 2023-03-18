package LabFinalPractise;

public abstract class AbstractionPractise {
    abstract void run();
    void eat(){
        System.out.println("eating");
    }
}
class MyClass extends AbstractionPractise{
    @Override
    void run() {
        System.out.println("Running");
    }


}
class Test{
    public static void main(String[] args) {
        AbstractionPractise p= new MyClass();
        p.eat();
        p.run();
    }
}