package MidExam;

public class Shape {
//id:- 201002437
    int length =22;
    int breadth =10;
    Shape(int length)
    {
        this.length=length;
    }
    Shape(int length, int breadth){
        this.length= length;
        this.breadth= breadth;
    }

    int Calculate_area(int a,int b){
       int rectangle = a*b;
       return rectangle;
    }
    int Calculate_area(int a)
    {
        int Square= a*a;
        return Square;
    }

}
class Test{
    public static void main(String[] args) {
        Shape rectangle = new Shape(20,20);
        System.out.println(rectangle);

        Shape Square= new Shape(20);
        System.out.println(Square);
    }
}
