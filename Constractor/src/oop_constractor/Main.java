package oop_constractor;
class Teacher{
    String name,gender;
    String phone;
    //parameterised constructor
    Teacher(String n,String g,String p)
    {
        name= n;
        gender=g;
        phone=p;
    }
    //default constructor
    Teacher()
    {
        System.out.println("No value");
    }
    void displayInformation()
    {
        System.out.println("Name is:- "+name);
        System.out.println("Gender:- "+gender);
        System.out.println("Phone:- "+phone);
        System.out.println("\n");
    }
}

public class Main {

    public static void main(String[] args) {
        Teacher teacher_one= new Teacher("Nafis Fuad Tanvir","Male","01537485733");
        teacher_one.displayInformation();
        Teacher teacher2 = new Teacher();
        teacher2.displayInformation();

    }
}
