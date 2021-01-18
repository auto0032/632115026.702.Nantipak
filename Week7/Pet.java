package Week7;

public class Pet {
    String name;
    String breed;
    String color;
    int age;

    public Pet(){}
    public Pet(String name,String breed,String color,int age){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }
    public void PrintPet(){
        System.out.println("Name: "+name+"\nBreed: "+breed+"\nColor: "+color+"\nAge: "+age+".");
    }
}
