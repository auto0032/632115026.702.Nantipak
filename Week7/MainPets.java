package Week7;

public class MainPets {
    public static void main(String[]args){
        dog mootoon=new dog("Mootoon","Pug","Lite Brown",1);
        System.out.println("DOG");
        mootoon.PrintPet();
        mootoon.paly("His Friend");
        mootoon.food("large");
        mootoon.hair("short");
        System.out.println(" ");

        cat moji=new cat("moji","Persia","Gray",2);
        System.out.println("Cat");
        moji.PrintPet();
        moji.residence("home");
        moji.size("8foot");
        System.out.println(" ");

        hamster didi=new hamster("didi","Giamt","yellow",1);
        System.out.println("Hamster");
        didi.PrintPet();
        didi.want("Sleep");
        didi.size("large");
        System.out.println(" ");
    }
}
