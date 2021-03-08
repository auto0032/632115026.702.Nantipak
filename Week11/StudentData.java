package Week11;

public class StudentData {
    public static void main(String[]args){
        
        Student std01=new Student("Mark",18,4.00);
        Student std02=new Student("Jane",18,2.00);
        Student std03=new Student("Peter",19,4.00);
        Student std04=new Student("Mark",22,1.75);

        System.out.println("Compare Name");
        System.out.println("Compare std01 to std02: "+std01.equals(std02));
        System.out.println("Compare std01 to std03: "+std01.equals(std03));
        System.out.println("Compare std02 to std04: "+std02.equals(std04));
        System.out.println("Compare std01 to std04: "+std01.equals(std04));

        System.out.println("\nCompare AGE");
        System.out.println("Compare std01 to std02: "+std01.ageEquals(std02));
        System.out.println("Compare std03 to std04: "+std03.ageEquals(std04));
        System.out.println("Compare std01 to std03: "+std01.ageEquals(std03));

        System.out.println("\nCompare GPA");
        System.out.println("Compare std01 to std03: "+std01.GPAEquals(std03));
        System.out.println("Compare std02 to std04: "+std02.GPAEquals(std04));
        System.out.println("Compare std02 to std03: "+std02.GPAEquals(std03));
        

    }
}
