package Week6;
//Nantipak Tathong 632115026
public class Engineer extends Person{
    String cmu;
    public Engineer(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void SE(){
        System.out.println(name+" Study in "+cmu+" CAMT");
    }
}
