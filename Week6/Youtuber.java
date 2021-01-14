package Week6;
//Nantipak Tathong 632115026
public class Youtuber extends Person{
    String google;
    public Youtuber(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void antieSiow(){
        System.out.println(name+" perform to Antie Siow on Youtube "+google);
    }
}
