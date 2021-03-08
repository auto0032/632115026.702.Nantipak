package Week11;

public class Student {
    String name;
    int age;
    double gpa;

    public Student(String name, int age, double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
    public boolean equals(Student std00) {
        if (std00 instanceof Student) {
            return name == ((Student) std00).name;
        }
        else {
            return false;
        }
    }
    public boolean ageEquals(Student std00){
        if (std00 instanceof Student){
            return age==((Student)std00).age;
        }
        else {
            return false;
        }
    }
    public boolean GPAEquals(Student std00){
        if (std00 instanceof Student){
            return gpa ==((Student)std00).gpa;
        }
        else {
            return false;
        }
    }
}
