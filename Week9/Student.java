package Week9;

public class Student {
    private String FirstName="Hello";
    private String LastName="World";

    public Student(String FirstName,String LastName){
        this.FirstName=FirstName;
        this.LastName=LastName;
    }
    public String returnString(){
        return "My First Name is: "+FirstName+" and my Last Name is: "+LastName;
    }
    public static void main(String[]args){
        Student p=new Student("Hello","World");
        System.out.println(p.returnString());
    }
}
