import java.util.Random;
import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // O computador escolhe um número aleatório entre 1 e 100
        int numeroEscolhido = random.nextInt(100) + 1;

        int tentativa;
        int contadorTentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            contadorTentativas++;

            if (tentativa < numeroEscolhido) {
                System.out.println("O número é maior que " + tentativa + ".");
            } else if (tentativa > numeroEscolhido) {
                System.out.println("O número é menor que " + tentativa + ".");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + contadorTentativas + " tentativas.");
            }
        } while (tentativa != numeroEscolhido);

        scanner.close();
    }
}
