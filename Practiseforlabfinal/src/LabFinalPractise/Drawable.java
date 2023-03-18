package LabFinalPractise;

public interface Drawable {
    void draw();
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Circle is drawing");
    }
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Rectangle is drawing");
    }
}
class Test1{
    public static void main(String[] args) {
        Drawable d= new Circle();
        Drawable d1= new Rectangle();
        d.draw();
        d1.draw();
    }
}