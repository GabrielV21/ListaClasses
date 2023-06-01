package Ex02;
public class Quadrado {
    double lado;
    public double getLado(){
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double calcArea(){
        return lado*lado;
    }
}