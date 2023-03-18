package oop;
class Employee{
    int salary;
    String name;

    public int getSalary()
    {
       return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name= n;
    }
}
class MyGame{

    public int sum(int a,int b)
    {
        return a+b;
    }
    public int subTract(int c,int d)
    {
        return c-d;
    }

}

public class PractiseProblem1 {
    public static void main(String[] args) {
       /* Employee nafis= new Employee();
        nafis.setName("Nafis Fuad Tanvir");
        nafis.salary= 50000;
        System.out.println("name is:- "+nafis.getName());
        System.out.println("salary is:- "+nafis.getSalary());*/
        MyGame user1= new MyGame();
        System.out.println(user1.sum(50,20));

    }
}
