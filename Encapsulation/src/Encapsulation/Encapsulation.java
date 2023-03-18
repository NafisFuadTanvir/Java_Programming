package Encapsulation;
import java.util.*;
class person{
    private String name;
    private int age;
   private int sellary;

    /*void display()
    {
        System.out.println("Name is:-"+name);
        System.out.println("Age is:-"+age);
        System.out.println("Sallary is:-"+sellary);
    }*/
    public void setName(String name)
    {
        this.name= name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age= age;
    }
    public int getAge()
    {
        return age;
    }
    public void setSellary(int sellary)
    {
        this.sellary= sellary;
    }
    public int getSellary()
    {
        return sellary;
    }
}
public class Encapsulation {
    public static void main(String[] args)
    {
        /* encapsulation is a process of
        1. packaging  variable and methods in a single unit
        2.protecting data by declaring them as private.
         */

        /* How to do encapsulation?
        1. Declare the variable as private.
        2. provide public setter and getter method to modify and get the variables value.
         */
        Scanner input= new Scanner(System.in);
        person person1= new person();
       /* person1.name= input.nextLine();
        person1.age=input.nextInt();
        person1.sellary= input.nextInt();
        person1.display();*/
          person1.setName(input.nextLine());
          person1.setAge(input.nextInt());
          person1.setSellary(input.nextInt());
        System.out.println("Name is:- "+ person1.getName());
        System.out.println("Age is:- "+ person1.getAge());
        System.out.println("Sellary is:- "+ person1.getSellary());


    }
}
