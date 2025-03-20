package exerciciosPOO;

public class ClasseCarro {
    public String marca;
    public String modelo;
    public int ano;

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void setAno(int novoAno) {
        ano = novoAno;
    }
}
