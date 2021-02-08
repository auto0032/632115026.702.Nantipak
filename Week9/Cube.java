package Week9;

class Cube extends Rectangle{
    private int Length;

    public Cube(int Width,int Height,int Length){
        super(Width,Height);
        this.Length=Length;
    }
    public String toString(){
        return "This is a Cube with side of: "+Length;
    }
}
