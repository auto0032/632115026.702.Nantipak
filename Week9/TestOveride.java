package Week9;

public class TestOveride {
    public static void main(String[]args){
        System.out.println("|");
        Person person1=new Person("Auto",2002);
        person1.intro();
        System.out.println("|");

        Sheriff person2=new Sheriff("Mateo",1988,"California");
        person2.intro();
        System.out.println("|");

        Teacher person3=new Teacher("Ball",1977,"CMU");
        person3.intro();
        System.out.println("|");

        PrimeMinister person4=new PrimeMinister("Tu",1954,"Thailand");
        person4.intro();
        System.out.println("|");

        FootBall person5=new FootBall("Messi",1987,"Barcelona");
        person5.intro();
        System.out.println("|");

        Friend person6=new Friend("Korn",2001,"Software Engineering");
        person6.intro();
        System.out.println("|");

        Shape shape1=new Shape();
        System.out.println(shape1.toString());
        System.out.println("|");

        Rectangle shape2=new Rectangle(10,50);
        System.out.println(shape2.toString());
        System.out.println("|");

        Cube shape3=new Cube(10,50,25);
        System.out.println(shape3.toString());
        System.out.println("|");
    }
}
