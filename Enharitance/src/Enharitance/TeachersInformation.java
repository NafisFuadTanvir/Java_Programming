package Enharitance;

public class TeachersInformation extends StudentInformation {
    long phoneNumber;
    void displayTea()
    {
        displayStu();
        System.out.print("Phone number is:- "+phoneNumber);
    }
}
