package Ex04;
public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;

    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public double getPeso() {return peso;}
    public double getAltura() {return altura;}

    public void envelhecer(int anos){
        int antes = idade;
        idade += anos;
        if (antes < 21) {
            if (idade < 21) {
                crescer(anos*0.5);
            } else {
                crescer((21-antes)*0.5);
            }
        }
    }
    public void engordar(double quilos){
        peso += quilos;
    }
    public void emagrecer(double quilos){
        peso -= quilos;
    }
    public void crescer(double cms){
        altura += cms;
    }
    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
}