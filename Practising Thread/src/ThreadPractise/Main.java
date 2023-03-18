package ThreadPractise;

class Mythread extends Thread{
    public void run(){

            System.out.println("i am the first thread");
            System.out.println("i am running");




    }
}
class Mythread2 extends Thread{
    public void run(){
        System.out.println("i am the second thread");
        System.out.println("i am running good");
    }
}
public class Main {

    public static void main(String[] args) {
        Mythread m1= new Mythread();
        Mythread2 m2= new Mythread2();
        m1.start();
        m2.start();

    }
}
