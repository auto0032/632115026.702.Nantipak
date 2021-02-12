package Week10;

public class Human {
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }
    public static void main(String[]args){
        Animal Dog=new Dog();
        Human Human= new Human();
        System.out.println("The First Calling Hit(Animal)");
        Human.hit(Dog);

        Dog=new Fish();
        System.out.println("The Secon Calling Hit(Animal)");
        Human.hit(Dog);
    }
}
