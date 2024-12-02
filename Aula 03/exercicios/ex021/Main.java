package ex021;

public class Main {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Moderna", 4, "Branca");

        cozinha.cozinhar();
        cozinha.limpar();
    }
}
