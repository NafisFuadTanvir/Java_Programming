package Oop_203DB;
import java.util.Scanner;
class Calculation{
    float a,b;
    double area;
        Calculation(float a,float b)
    {
        area= (a*b)/2;

    }
    Calculation(int a,int b)
    {
            area= a*b;
    }
    Calculation(float r){
            area=3.1416*r*r;
    }
}


public class LabTask2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        Calculation triangle= new Calculation(input.nextFloat(),input.nextFloat());
        System.out.println("area of triangel is:- "+ triangle.area);
        Calculation rectangel= new Calculation(input.nextInt(),input.nextInt());
        System.out.println("area of rectangle is:-"+ rectangel.area);
        Calculation circle= new Calculation(input.nextFloat());
        System.out.println("area of circle is;- "+circle.area);

    }
}
