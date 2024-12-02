public class Carro {

    public void acelerando(){
        System.out.println("Acelerando");
    }
    public void freiando(){
        System.out.println("Freiando");
    }

    public String modelo;
    public String marca;
    public int ano;
    public String cor;
    public int potencia;
    public double valor;
    public int maxSpeed;

    public Carro() {
    }

    public Carro(String modelo, String marca, int ano, String cor,int potencia,double valor,int maxSpeed) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.potencia = potencia;
        this.valor = valor;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", potencia=" + potencia + "HP" +'\'' +
                ", valor='" + valor +"R$"+ '\'' +
                ", maxSpeed='" + maxSpeed +"Km/h"+ '\'' +
                '}';
    }
}
