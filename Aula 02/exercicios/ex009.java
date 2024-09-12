import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma operação:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Digite a opção desejada (1-4): ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção entre 1 e 4.");
        }
        scanner.close();
    }
}
