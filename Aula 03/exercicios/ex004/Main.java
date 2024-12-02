package ex004;

public class Main {
    public static void main(String[] args){
        ContaBancaria contaAroldo = new ContaBancaria("415203",-1210);

        contaAroldo.depositar();
        contaAroldo.sacar();
    }
}
