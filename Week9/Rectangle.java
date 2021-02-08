package Week9;

class Rectangle extends Shape{
    private int Width;
    private int Height;

    public Rectangle(int Width,int Height){
        this.Width=Width;
        this.Height=Height;
    }
    public String toString(){
        return "This is a Rectangle with the Width and Height Width is: "+Width+" Height is: "+Height;
    }
}
