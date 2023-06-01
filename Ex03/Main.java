package Ex03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Inform the value of sideA: ");
        r.setSideA(sc.nextDouble());
        System.out.println("Inform the value of sideB: ");
        r.setSideB(sc.nextDouble());
        sc.close();
        System.out.println("The area: " + r.calcArea());
        System.out.println("The perimeter: " + r.calcPerimeter());
    }
}