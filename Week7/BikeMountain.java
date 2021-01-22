package Week7;

public class BikeMountain extends Bike{
    int Gear;

    public BikeMountain(int speed){
        this.speed=speed;
    }
    public void GearChange(int Gear){
        this.Gear=Gear;
        speed+=Gear*5;
    }
    public void Brake(){
        speed-=5;
    }
}
