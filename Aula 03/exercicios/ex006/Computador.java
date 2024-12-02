package ex006;

public class Computador {
    private String processador;
    private int memoriaRAM;
    private double armazenamento;

    public Computador(String processador, int memoriaRAM, double armazenamento){
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    void ligando(){
        System.out.println("Ligando");
    }
    void desligar(){
        System.out.println("Desligando");
    }


}
