package Week7;

public class cat extends Pet{
    String size;
    String residence;

    public cat(String name,String breed,String color,int age){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }
    public void residence(String residence){
        this.residence=residence;
        if (residence.equals("home")){
            System.out.println("Runing on the Bed: True");
        }
        else if (residence.equals("backyard")){
            System.out.println("Runing on the Bed: False");
        }
    }
    public void size(String size){
        this.size=size;
        if (size.equals("4foot")){
            System.out.println(name+" is "+size+" not Happy.");
        }
        else if (size.equals("6foot")){
            System.out.println(name+" is "+size+" quite Happy.");
        }
        else if (size.equals("8foot")){
            System.out.println(name+" is "+size+" verry verry Happy.");
        }
    }
}
