package arraylist;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> b= new ArrayList<>();
        b.add(100);
        b.add(50020);
        b.add(00025);
        a.add(50);
        a.add(60);
        a.add(70);
        a.add(80);
        a.add(90);
        a.add(100);
        a.addAll(b);
        a.set(1,1000);
        for(int i=0;i<a.size();i++)
        {
            System.out.print(" "+a.get(i));
        }

    }
}
