package ex002;

public class Celular {
    //atributos
    private String marca;
    private String modelo;
    private int capacidadeBateria;

    public Celular(String marca,String modelo, int capacidadeBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    void ligar(){
        System.out.println("Ligando");
    }

    void desligar(){
        System.out.println("Desligando");
    }



}
