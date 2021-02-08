package Week9;

public class Person {
    private String Name;
    private int BornYear;

    public Person (String Name,int BornYear){
        this.Name=Name;
        this.BornYear=BornYear;
    }
    public void intro(){
        System.out.println("My Name is: "+Name);
        System.out.println("I Born at: "+BornYear);
    }
}
