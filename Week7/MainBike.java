package Week7;

public class MainBike {
    public static void main(String[]args){
        Bicycle bike1=new Bicycle(10);
        System.out.println("Bike:1");
        bike1.SpeedCheck();
        System.out.println("Bike:1 Speed up");
        bike1.SpeedChange();
        bike1.SpeedChange();
        bike1.SpeedCheck();
        System.out.println("Bike:1 Brake");
        bike1.Brake();
        bike1.SpeedCheck();

        BikeMountain bike2=new BikeMountain(10);
        System.out.println("Bike:2");
        bike2.SpeedCheck();
        System.out.println("Bike:2 Gear up to 5");
        bike2.GearChange(2);
        bike2.GearChange(3);
        bike2.SpeedCheck();
        System.out.println("Bike:2 Brake 3 Times");
        bike2.Brake();
        bike2.Brake();
        bike2.Brake();
        bike2.SpeedCheck();
    }
}
