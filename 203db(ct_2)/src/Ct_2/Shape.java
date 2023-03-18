package Ct_2;

public  abstract class Shape {

    private double dimOne;
    private double dimTwo;
    private double dimThree;


    public Shape (double dim1)  {
        dimOne = dim1;
    }


    public Shape (double dim1, double dim2) {
        dimOne = dim1;
        dimTwo = dim2;
    }


    public Shape (double dim1, double dim2, double dim3){
        dimOne = dim1;
        dimTwo = dim2;
        dimThree = dim3;
    }


    public void setDimOne(double dim1)  {
        dimOne = dim1;
    }
    public double getDimOne()   {
        return dimOne;
    }


    public void setDimTwo(double dim2) {
        dimTwo = dim2;
    }
    public double getDimTwo()   {
        return dimTwo;
    }


    public void setDimThree(double dim3) {
        dimThree = dim3;
    }
    public double getDimThree() {
        return dimThree;
    }

    public abstract double getArea();

    public String getName() {
        return getClass().getName();
    }

    @Override
    public String toString(){
        return "area = " + getArea();
    }
}
abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape(double dim1) {
        super(dim1);
    }

    public TwoDimensionalShape(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public abstract double getArea();
}

abstract class ThreeDimensionalShape extends Shape {

    public ThreeDimensionalShape(double dim1) {
        super(dim1);
    }

    public ThreeDimensionalShape (double dim1, double dim2, double dim3)	{
        super(dim1, dim2, dim3);
    }

    public abstract double getArea();
    public abstract double getVolume();
}

class Circle extends TwoDimensionalShape {

    public Circle(double dim1) {
        super(dim1);
    }

    private double circleArea = (Math.pow(getDimOne(), 2) * Math.PI);

    @Override
    public double getArea()
    {
        return circleArea;
    }

    @Override
    public String toString()
    {
        return " radius: " + getDimOne();
    }

}
class Square extends TwoDimensionalShape {

    public Square(double dim1) {
        super(dim1);
    }

    private double squareArea = getDimOne() * getDimOne();

    @Override
    public double getArea() {
        return squareArea;
    }

    @Override
    public String toString() {
        return " length: " + getDimOne();
    }
}
class Triangle extends TwoDimensionalShape {


    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    private double triangleArea = getDimOne() * getDimTwo() * 0.5;

    @Override
    public double getArea()	{
        return triangleArea;
    }

    @Override
    public String toString(){
        return " base: " + getDimOne() + " height: " + getDimTwo();
    }
}

class Sphere extends ThreeDimensionalShape {

    public Sphere(double dim1) {
        super(dim1);
    }

    private double sphereArea = 4 * (Math.pow(getDimOne(), 2) * Math.PI);
    private double sphereVolume = Math.PI * 4/3 * Math.pow(getDimOne(), 3.0);

    @Override
    public double getArea() {
        return sphereArea;
    }

    @Override
    public double getVolume() {
        return sphereVolume;
    }

    @Override
    public String toString()	{
        return " radius: " + getDimOne();
    }
}

class Cube extends ThreeDimensionalShape {

    public Cube(double dim1) {
        super(dim1);
    }

    private double cubeArea = 6 * Math.pow(getDimOne(), 2.0);
    private double cubeVolume = Math.pow(getDimOne(), 3.0);

    @Override
    public double getArea() {
        return cubeArea;
    }

    @Override
    public double getVolume() {
        return cubeVolume;
    }

    @Override
    public String toString() {
        return " length: " + getDimOne();
    }
}
class Tetrahedron extends ThreeDimensionalShape{

    public Tetrahedron (double dim1, double dim2, double dim3)	{
        super(dim1, dim2, dim3);
    }

    private double tetrahedronArea = 4 * (0.5 * getDimOne() * getDimTwo()) ;
    private double tetrahedronVolume = ((0.5 * getDimOne() * getDimTwo()) * getDimThree())/3;

    @Override
    public double getArea()	{
        return tetrahedronArea;
    }

    @Override
    public double getVolume()	{
        return tetrahedronVolume;
    }

    @Override
    public String toString()	{
        return " base width: " + getDimOne() + " base height: " + getDimTwo() + " height " + getDimThree();
    }
}
 class Shapes {

    public static void main(String[] args) {

        Shape shape[] = new Shape[6];
        shape[0] = new Circle(7.0);
        shape[1] = new Square(7.0);
        shape[2] = new Triangle(4.0, 5.0);
        shape[3] = new Sphere(1.0);
        shape[4] = new Cube(1.0);
        shape[5] = new Tetrahedron(1.0);

        for (Shape curentShape : shape) {
            System.out.println(curentShape);
            if (curentShape instanceof TwoDimentionalShape) {
                TwoDimentionalShape twoDimentionalShape = (TwoDimentionalShape) curentShape;

                System.out.printf("%sArea: %.2f\n\n", twoDimentionalShape.toString(), twoDimentionalShape.getArea());

            } else if (curentShape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) curentShape;
                System.out.printf("%sArea: %.2f\n\n", threeDimensionalShape.toString(), threeDimensionalShape.getVolume());

                System.out.printf("%sArea: %.2f\n\n", threeDimensionalShape.toString(), threeDimensionalShape.getArea());
            }

        }
    }
}



