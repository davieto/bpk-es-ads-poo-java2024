package ex015;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Witcher 3", "RPG", 305.42);

        jogo.iniciar();
        jogo.pausar();
    }
}
