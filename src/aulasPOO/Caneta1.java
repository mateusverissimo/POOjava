package aulasPOO;

public class Caneta1 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor); // this chama o metodo status
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

     public void destampar() {
        this.tampada = false;
    }
}
