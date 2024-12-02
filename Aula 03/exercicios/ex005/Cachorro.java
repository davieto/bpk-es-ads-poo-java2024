package ex005;

public class Cachorro {

    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome,String raca,int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void latir(){
        System.out.println("Latindo");
    };
    void correr(){
        System.out.println("Correndo");
    }


}
