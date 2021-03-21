package Week12;

public class MainShape {
    public static void main(String[]args){
        Shape square=new Square(12,4);
        Square.getArea();
        Shape traingle=new Triangle(10,15);
        Triangle.getArea();
        Shape circle=new Circle(5);
        Circle.getArea();
    }
}
