package Week12;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public static void getArea(){
        double area;
        area=0.5*base*height;
        System.out.println("Area of triangle: "+area+"unit^2");
    }
}
