package Ex01;
public class Bola {
    private String cor;
    private double circunferencia;
    private String material;

    public String getCor() {return cor;}
    public double getCircunferencia() {return circunferencia;}
    public String getMaterial() {return material;}

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
}