package Week9;

class FootBall extends Person{
    String Club;
    public FootBall(String Name,int BornYear,String Club){
        super(Name,BornYear);
        this.Club=Club;
    }
    public void intro(){
        super.intro();
        System.out.println("I'm a Football Player Working in: "+Club);
    }
}
