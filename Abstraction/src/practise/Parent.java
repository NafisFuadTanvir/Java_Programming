package practise;

public abstract class Parent {
    abstract void career(String name);
    abstract void Partner(String name, int age);

}
class Son extends Parent{
    @Override
    void career(String name) {
        System.out.println("i am going to be a:- "+name);
    }

    @Override
    void Partner(String name, int age) {
        System.out.println("my partner name is"+name+"he is"+age+ "old");

    }

    public static void main(String[] args) {
        Parent myParent= new Son();
        myParent.career("Enginerr");

    }
}
