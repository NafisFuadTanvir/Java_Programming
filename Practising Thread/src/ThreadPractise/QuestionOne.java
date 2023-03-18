package ThreadPractise;
class Thr1 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }catch(Exception e){
                System.out.println(e);
            }

            System.out.println("Good morning");
        }

    }
}
class Thr2 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("welcome to the new day");
        }

    }
}
public class QuestionOne {
    public static void main(String[] args) {
        Thr1 t1= new Thr1();
        Thr2 t2= new Thr2();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
    }
}
