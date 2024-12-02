package ex016;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("Loja Central", "Rua Principal, 123", "1234-5678");

        loja.abrir();
        loja.fechar();
    }
}
