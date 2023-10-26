public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Circle cir=new Circle(3);
        cir.resize(100);
        System.out.println(cir.getRadius());

    }
}