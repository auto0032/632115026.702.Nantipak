package Week9;

class Friend extends Person{
    String Major;
    public Friend(String Name,int BornYear,String Major){
        super(Name,BornYear);
        this.Major=Major;
    }
    public void intro(){
        super.intro();
        System.out.println("He Study at CAMT Major: "+Major);
    }
}
