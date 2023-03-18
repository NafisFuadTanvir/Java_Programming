package AllOparetions;

public class Car extends Vehicals{
int gear;
Car(String name,String colour,String weight,int gear)
{
    super(name,colour,weight);//calling the constructors of vahicle class.
    this.gear=gear;

    }
    void attribute()
    {
        super.attribute();
        System.out.println("gear is:- "+gear);
    }

}
