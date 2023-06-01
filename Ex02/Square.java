package Ex02;
public class Square {
    double side;
    public double getSide(){
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double calcArea(){
        return side*side;
    }
}