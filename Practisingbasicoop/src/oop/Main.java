package oop;
import java.util.*;
class Info
{
    int id;
    String name;
    public void display()
    {
        System.out.println("id is:- "+id);
        System.out.println("name is:- "+name);
        System.out.println();
    }
    public void getInfo(int stuid,String stuname)
    {
        id= stuid;
        name= stuname;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Info stu1= new Info();
        Info stu2= new Info();
         stu1.getInfo(201002437,"Nafis Fuad Tanvir");
         stu1.display();
         stu2.getInfo(201002215,"jamilur Rahaman");
         stu2.display();


    }
}
