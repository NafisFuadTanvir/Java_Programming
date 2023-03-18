package ThreadPractise;

public class Creation implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread is running");
    }
}
class Test5{
    public static void main(String[] args) {
        Creation c= new Creation();
        Thread t= new Thread(c);
        t.start();
    }
}
