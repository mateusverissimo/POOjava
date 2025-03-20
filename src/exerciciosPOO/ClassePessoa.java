package exerciciosPOO;

public class ClassePessoa {
    public String nome;
    public int idade;
    public double altura;

    public void dadosPessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    public void setAltura(double novaAltura) {
        altura = novaAltura;
    }
}
