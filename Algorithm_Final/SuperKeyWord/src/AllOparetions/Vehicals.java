package AllOparetions;

public class Vehicals {
    String name;
    String colour;
    String weight;
    Vehicals(String name,String colour,String Weight)
    {
        this.name= name;
        this.colour= colour;
        this.weight= weight;
    }
    void attribute()
    {
        System.out.println("Name is:- "+name);
        System.out.println("colour is:- "+colour);
        System.out.println("weight is:- "+weight);
    }
}
