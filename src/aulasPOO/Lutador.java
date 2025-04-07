package aulasPOO;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

//    lutadores = vetor[0... 5]
//    L[0] = new Lutador();
//    L[1] = new Lutador();
//    L[2] = new Lutador();
//    L[3] = new Lutador();
//    L[4] = new Lutador();
//    L[5] = new Lutador();
//    L[0].apresentar();
//    L[2].status();
//    L[3].getCategoria();
//    L[1].ganharLuta();
//    L[0].empatarLuta();


    public void apresentar() {
        System.out.println("---UEC---");
        System.out.println("Lutador: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println(getIdade() + "anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso() + "Kg");
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }

    public void status() {
        System.out.println(getNome());
        System.out.println("É um peso" + getCategoria());
        System.out.println(getVitorias() + "vitórias");
        System.out.println(getDerrotas() + "derrotas");
        System.out.println(getEmpates() + "empates");

    }

    public void Status() {
        System.out.println("Vitórias: ");
        System.out.println("Derrotas: ");
        System.out.println("Empates: ");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String no, String na, int id, double al, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

}
