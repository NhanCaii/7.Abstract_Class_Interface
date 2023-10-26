public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Square[] squa= new Square[2];
        squa[0]= new Square(3);
        squa[1]= new Square(4);

        System.out.println(squa[1].toString());
    }
}