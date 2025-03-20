package exerciciosPOO;

public class MainCarro {
    public static void main(String[] args) {
        ClasseCarro c1 = new ClasseCarro();
        c1.marca = "Honda";
        c1.modelo = "City";
        c1.ano = 2024;

        c1.setAno(2025);

        c1.exibirDetalhes();
    }
}
