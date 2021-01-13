package Week5;

public class Circle {
    private double Radius=1;
    private double LandScape=0.0;
    private double Vertical=0.0;

    public Circle(){
    }

    public Circle(double newRadius,double LandScape,double Vertical){
        Radius=newRadius;
        this.LandScape=LandScape;
        this.Vertical=Vertical;
    }
    public double getArea(){
        if (Radius<0){
            return 0.0;
        }
        else {
            return Radius*Radius*Math.PI;
        }
    }
    public double getCircumference(){
        if (Radius<0){
            return 0.0;
        }
        else {
            return 2*Math.PI*Radius;
        }
    }
    public static boolean getIntersect(Circle c1,Circle c2){
        double disS=0;
        disS=(c1.LandScape-c2.LandScape)*(c1.LandScape-c2.LandScape)+(c1.Vertical- c2.Vertical)*(c1.Vertical- c2.Vertical);

        double SumS=0;
        SumS=(c1.Radius+c2.Radius)*(c1.Radius+c2.Radius);

        if (disS>SumS){
            return false;
        }
        else {
            return true;
        }
    }
}
