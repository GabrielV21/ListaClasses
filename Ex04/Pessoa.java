package Ex04;
public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;
    public int envelhecer(int anos){
        return idade+anos;
    }
    public double engordar(double quilos){
        return peso+quilos;
    }
    public double emagrecer(double quilos){
        return peso-quilos;
    }
    public double crescer(int anos){
        if(idade<=21) {
            altura = anos*0.5;
        }
        return altura;
    }
}