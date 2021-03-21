package Week12;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public static void getArea(){
        double area;
        area=Math.PI*(Math.pow(radius,2));
        System.out.println("Area of circle: "+area+"unit^2");
    }
}
