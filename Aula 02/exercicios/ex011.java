import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Remove espaços e converte a palavra para minúsculas
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        // Verifica se a palavra é um palíndromo
        String palavraReversa = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(palavraReversa)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

        scanner.close();
    }
}
