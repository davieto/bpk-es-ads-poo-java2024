package ex017;

public class Animal {
    private String especie;
    private int idade;
    private double peso;

    void alimentar() {
        System.out.println("Alimentando o animal.");
    }

    void dormir() {
        System.out.println("Animal dormindo.");
    }

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }
}
