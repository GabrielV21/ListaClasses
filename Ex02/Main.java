package Ex02;
public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(5);
        System.out.println(square.getSide());
        System.out.println(square.calcArea());
    }
}