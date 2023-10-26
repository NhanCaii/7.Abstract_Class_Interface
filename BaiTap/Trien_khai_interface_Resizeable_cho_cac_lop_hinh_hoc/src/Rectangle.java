public class Rectangle implements Resizeable{
    private double width=1;
    private double height=1;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void resize(double percent) {
        this.width=getWidth()+ getWidth()*percent/100;
        this.height=getHeight()+ getHeight()*percent/100;
    }
}
