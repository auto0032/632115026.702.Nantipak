package Week9;

class Sheriff extends Person{
    String WorkState;
    public Sheriff(String Name,int BornYear,String WorkState){
        super(Name,BornYear);
        this.WorkState=WorkState;
    }
    public void intro(){
        super.intro();
        System.out.println("I'm a Sheriff Working in: "+WorkState);
    }
}
