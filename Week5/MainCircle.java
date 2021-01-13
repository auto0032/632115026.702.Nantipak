package Week5;

public class MainCircle {
    public static void main(String[]args){
        Circle c1=new Circle(2.0,0.0,0.0);
        System.out.println("Area of c1= "+c1.getArea());
        System.out.println("Circumference of c1= "+c1.getCircumference());

        Circle c2=new Circle(3.0,1.0,2.0);
        System.out.println("Area of c2= "+c2.getArea());
        System.out.println("Circumference of c2= "+c2.getCircumference());

        Circle c3=new Circle(1.0,3.0,5.0);
        System.out.println("Area of c3= "+c3.getArea());
        System.out.println("Circumference of c3= "+c3.getCircumference());

        Circle c4=new Circle(-1.0,-1.0,-10.0);
        System.out.println("Area of c4= "+c4.getArea());
        System.out.println("Circumference of c4= "+c4.getCircumference());

        System.out.println("Is c1 Intersect c2: "+Circle.getIntersect(c1,c2));
        System.out.println("Is c1 Intersect c3: "+Circle.getIntersect(c1,c3));
    }
}
