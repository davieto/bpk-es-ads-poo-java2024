import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        // Converte a string para minúsculas para simplificar a verificação
        entrada = entrada.toLowerCase();

        // Inicializa o contador de vogais
        int contadorVogais = 0;

        // Verifica cada caractere da string
        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            // Verifica se o caractere é uma vogal
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais na string: " + contadorVogais);

        scanner.close();
    }
}
