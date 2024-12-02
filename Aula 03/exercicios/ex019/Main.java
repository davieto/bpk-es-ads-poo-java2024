package ex019;

public class Main {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("1984", "George Orwell", 2.5);

        livro.abrir();
        livro.fechar();
    }
}
