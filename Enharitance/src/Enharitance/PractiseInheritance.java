package Enharitance;
import java.util.*;
public class PractiseInheritance {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
      StudentInformation stu1= new StudentInformation();
        System.out.print("Enter the name:- ");
        stu1.name= input.nextLine();
        System.out.print("Enter the ID:- ");
        stu1.id= input.nextLine();
        System.out.print("Enter the address:- ");
        stu1.address= input.nextLine();
        System.out.print("Enter the cgpa:- ");
        stu1.cgpa= input.nextLine();
        stu1.displayStu();

        TeachersInformation tea1= new TeachersInformation();
        System.out.print("Enter the name:- ");
        tea1.name=input.nextLine();
        System.out.print("Enter the ID:- ");
        tea1.id=input.nextLine();
        System.out.print("Enter the address:- ");
        tea1.address=input.nextLine();
        System.out.print("Enter the cgpa:- ");
        tea1.cgpa=input.nextLine();
        System.out.print("Enter the phonenumber:- ");
        tea1.phoneNumber=input.nextLong();
        tea1.displayTea();


    }
}
