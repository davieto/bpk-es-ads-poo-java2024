import java.util.Scanner;

public class ex015 {
    // Método iterativo para calcular o fatorial
    public static long fatorialIterativo(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método recursivo para calcular o fatorial
    public static long fatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            // Cálculo e exibição do fatorial usando a versão iterativa
            long fatorialIterativo = fatorialIterativo(numero);
            System.out.println("Fatorial (iterativo) de " + numero + " é: " + fatorialIterativo);

            // Cálculo e exibição do fatorial usando a versão recursiva
            long fatorialRecursivo = fatorialRecursivo(numero);
            System.out.println("Fatorial (recursivo) de " + numero + " é: " + fatorialRecursivo);
        }
        scanner.close();
    }
}
