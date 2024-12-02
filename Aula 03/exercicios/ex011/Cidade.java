package ex011;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    // Construtor para inicializar os atributos
    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    void aumentar() {
        System.out.println("Aumentando");
    }

    void diminuir() {
        System.out.println("Diminuindo");
    }


}
