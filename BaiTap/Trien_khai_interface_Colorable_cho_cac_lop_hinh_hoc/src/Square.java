public class Square implements  Colorable{

    private int side=1;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public double area(){
        return Math.pow(this.side,2);
    }
    @Override
    public String howToColor() {
        return "Color all four sides..";
    }

    @Override
    public String toString(){
        return "Square: "+getSide()+" ,area: "+area()+howToColor();
    }
}
