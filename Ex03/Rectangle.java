package Ex03;
public class Rectangle {
    double sideA;
    double sideB;
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double calcArea() {
        return sideA * sideB;
    }
    public double calcPerimeter() {
        return (2*sideA + 2*sideB);
    }
}