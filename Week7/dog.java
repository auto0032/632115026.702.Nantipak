package Week7;

public class dog extends Pet{
    String size;
    String hair;
    String play;

    public dog(String name,String breed,String color,int age){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }
    public void paly(String play){
        this.play=play;
        System.out.println("My Dog "+name+" Playing with "+play);
    }
    public void food(String size){
        this.size=size;
        if (size.equals("small")){
            System.out.println(size+"Food: Lovepets");
        }
        else if (size.equals("medium")){
            System.out.println(size+"Food: Petdregre");
        }
        else if (size.equals("large")){
            System.out.println(size+"Food: Royalcanin");
        }
    }
    public void hair(String hair){
        this.hair=hair;
        if (hair.equals("short")){
            System.out.println("Short hair: True");
        }
        else {
            System.out.println("Short hair: False");
        }
    }
}
