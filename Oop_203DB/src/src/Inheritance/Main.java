package Inheritance;


class Vehicle{
    String name;
    String weight;
    void display(){
        System.out.println("Name is:- "+name);
        System.out.println("weight is:- "+weight);
    }
}
class Car extends Vehicle{
    String oilName;
    void display1(){
        System.out.println("Using the oil:- "+oilName);
    }

}

class Bike extends Vehicle{
    String companyName;
    void display2()
    {
        System.out.println("company name is:- "+companyName);
    }

}
class HierarichalInheritance{
    public static void main(String[] args) {


        Car myCar=new Car();
        myCar.name="Ferrari";
        myCar.weight="1000kg";
        myCar.oilName="Pennzoil® PurePlus®";
        myCar.display();
        myCar.display1();

        System.out.println();


        Bike myBike= new Bike();
        myBike.name="Yamaha MT-15";
        myBike.weight= "400kg";
        myBike.companyName="Yamaha";
        myBike.display();
        myBike.display2();
    }
}