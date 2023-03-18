package Enharitance.PractiseForFinal;

public class Animle {
    void eat(){
        System.out.println("eating");
    }
}
class Cat extends Animle{
    void weep(){
        System.out.println("weeping");
    }
}
class Dog extends Animle{
    void bark(){
        System.out.println("Barking");
    }
}
class Test{
    public static void main(String[] args) {
        Cat c= new Cat();
        c.eat();
        c.weep();
        Dog d= new Dog();
        d.eat();
        d.bark();
    }
}