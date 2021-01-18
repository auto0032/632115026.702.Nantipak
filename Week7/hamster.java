package Week7;

public class hamster extends Pet{
    String want;
    String size;

    public hamster(String name,String breed,String color,int age){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }
    public void want(String want){
        this.color=color;
        System.out.println(name+" want to "+want);
    }
    public void size(String size){
        this.size=size;
        if (size.equals("small")){
            System.out.println(name+" is "+size+" normal Hamster.");
        }
        else if (size.equals("mediam")){
            System.out.println(name+" is "+size+" fat Hamster.");
        }
        else if (size.equals("large")){
            System.out.println(name+" is "+size+" giant Hamster.");
        }
    }
}
