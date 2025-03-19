package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;

public class ClassePessoa {
    public String nome;
    public int idade;
    public float altura;

    Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public void dadosPessoa() {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void alterarAltura() {
    }

    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }
}
