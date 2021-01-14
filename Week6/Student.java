package Week6;
//Nantipak Tathong 632115026
public class Student extends Person{
    String subject;
    public Student (String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void FavSub(){
        System.out.println(name+" Fav Subject is "+subject);
    }
}
