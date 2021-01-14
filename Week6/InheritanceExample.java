package Week6;
//Nantipak Tathong 632115026
public class InheritanceExample {
    public static void main(String[]args){
        Artist art=new Artist("Ball",20,"Male");
        art.genre="hip hop";
        art.introduce();
        art.playMusic();

        Student stu=new Student("Auto",19,"Male");
        stu.subject="Programing";
        stu.introduce();
        stu.FavSub();

        Youtuber yt=new Youtuber("Jenn",27,"Female");
        yt.google="So i'm jenn";
        yt.introduce();
        yt.antieSiow();

        Cooker ck=new Cooker("Turbo",24,"Male");
        ck.kitchen="Home";
        ck.introduce();
        ck.Home();

        Engineer en=new Engineer("Korn",19,"Male");
        en.cmu="Chiang mai university";
        en.introduce();
        en.SE();

        Doctor dt=new Doctor("Benn",19,"Female");
        dt.WorkDays=4;
        dt.introduce();
        dt.working();
    }
}
