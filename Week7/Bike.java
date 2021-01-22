package Week7;

public class Bike {
    int speed;

    public Bike(){}
    public Bike(int speed){
        this.speed=speed;
    }
    public void SpeedCheck(){
        System.out.println("Speed Now: "+speed+" KM/H");
    }
}
