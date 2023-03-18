package practise;
class Car{
    public void run(){};
    public void move(){};
    public void left(){};
}

class Motorbike extends Car{
   public void run()
    {
        System.out.println("car is running");
    }
    public void move(){
        System.out.println("move to left");
    }
    public void left(){

        System.out.println("move right");
    }
}

public class Main {

    public static void main(String[] args) {
        Car newcar= new Motorbike();
        newcar.run();
        newcar.move();
        newcar.left();

    }
}
