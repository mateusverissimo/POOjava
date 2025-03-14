package aulasPOO;

public class SaoPaulo {
    // time de futebol

    private int fundacao;
    private String cor;
    private int titulosMundiais;
    private String craque;
    private String tecnico;

    public int getFundacao() {
        return fundacao;
    }

    public void setFundacao(int fundacao) {
        this.fundacao = fundacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTitulosMundiais() {
        return titulosMundiais;
    }

    public void setTitulosMundiais(int titulosMundiais) {
        this.titulosMundiais = titulosMundiais;
    }

    public String getCraque() {
        return craque;
    }

    public void setCraque(String craque) {
        this.craque = craque;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public SaoPaulo(int fundacao, String cor, int titulosMundiais, String craque, String tecnico) {
        this.tecnico = tecnico;
        this.craque = craque;
        this.titulosMundiais = titulosMundiais;
        this.cor = cor;
        this.fundacao = fundacao;
    }

    public void status() {
        System.out.println("São Paulo FC");
        System.out.println("Fundação: " + this.fundacao);
        System.out.println("Cores: " + this.cor);
        System.out.println("Títulos mundiais: " + this.titulosMundiais);
        System.out.println("Craque: " + this.craque);
        System.out.println("Técnico: " + this.tecnico);
    }
}
