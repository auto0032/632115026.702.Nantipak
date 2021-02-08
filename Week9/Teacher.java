package Week9;

class Teacher extends Person{
    String WorkState;
    public Teacher(String Name,int BornYear,String Workstate){
        super(Name,BornYear);
        this.WorkState=Workstate;
    }
    public  void intro(){
        super.intro();
        System.out.println("I'm a Teacher Teaching Student at: "+WorkState);
    }
}
