package MultipleInheritence;
import java.util.Scanner;
public class Vehical implements Bike,Car{
    Scanner in= new Scanner(System.in);
    @Override
    public String oilName(String name) {
        name= in.nextLine();
        return name;
    }

    public static void main(String[] args) {
        Car c= new Vehical();
        System.out.println(c.oilName(name.nextLine()));
        Bike b= new Vehical();
        System.out.println(b.oilName());

    }
}
