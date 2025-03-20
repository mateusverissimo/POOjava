package exerciciosPOO;

public class Pessoa {
    public static void main(String[] args) {
        ClassePessoa p1 = new ClassePessoa();
        p1.nome = "Mateus Verissimo";
        p1.idade = 19;
        p1.altura = 1.70;

        p1.setAltura(1.80);

        p1.mostrarDados();
    }
}
