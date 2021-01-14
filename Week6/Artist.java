package Week6;
//Nantipak Tathong 632115026
public class Artist extends Person{
    String  genre;
    public Artist(String name,int age,String gender){
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    public void playMusic(){
        System.out.println(name+" is playing "+genre+" music "+" gender is "+gender);
    }
}
