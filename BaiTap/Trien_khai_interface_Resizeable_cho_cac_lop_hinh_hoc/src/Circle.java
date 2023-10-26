public class Circle implements Resizeable{
    private double radius=1;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double percent){
        this.radius=getRadius()+getRadius()*percent/100;
    }
}
