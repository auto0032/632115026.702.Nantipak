package Week6;
//Nantipak Tathong 632115026
public class Cooker extends Person{
    String kitchen;
    public Cooker(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void Home(){
        System.out.println(name+" are love cooking in "+kitchen);
    }
}
