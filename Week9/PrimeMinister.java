package Week9;

class PrimeMinister extends Person{
    String Country;
    public PrimeMinister(String Name,int BornYear,String Country){
        super(Name,BornYear);
        this.Country=Country;
    }
    public void intro(){
        super.intro();
        System.out.println("I'm The Prime Minister work in: "+Country);
    }
}
