package ex001;

public class Main {
    public static void main(String[] args) {

        Livro sapiens = new Livro("Sapiens", "Yuval Harari", 200);

        sapiens.abrirLivro();
        sapiens.lerPagina();
    }
}
