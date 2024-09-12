import java.util.Scanner;
import java.util.Arrays;

public class ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Leitura dos 5 números
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordena o array em ordem crescente
        Arrays.sort(numeros);

        // Imprime os números em ordem crescente
        System.out.println("Números em ordem crescente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
