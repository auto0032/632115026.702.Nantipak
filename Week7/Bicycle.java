package Week7;

public class Bicycle extends Bike{
    public Bicycle(int speed){
        this.speed=speed;
    }
    public void SpeedChange(){
        speed+=5;
    }
    public void Brake(){
        speed-=5;
    }
}
