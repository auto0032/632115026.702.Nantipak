package Week12;

public class Square extends Shape{
    private double length;
    private double width;

    public Square(double length,double width){
        this.length=length;
        this.width=width;
    }
    public static void getArea(){
        double area;
        area=length*width;
        System.out.println("Area of square: "+area+"unit^2");
    }
}
