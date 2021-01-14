package Week6;
//Nantipak Tathong 632115026
public class Doctor extends Person{
    int WorkDays;
    public Doctor(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void working(){
        System.out.println(name+" Working for "+WorkDays+"Days");
    }
}
