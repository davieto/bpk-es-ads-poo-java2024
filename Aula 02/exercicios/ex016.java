import java.util.Scanner;

public class ex016 {

    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para converter Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Digite o número da opção desejada (1 ou 2): ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            // Conversão de Celsius para Fahrenheit
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusParaFahrenheit(celsius);
            System.out.printf("%.2f graus Celsius é igual a %.2f graus Fahrenheit.%n", celsius, fahrenheit);
        } else if (opcao == 2) {
            // Conversão de Fahrenheit para Celsius
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitParaCelsius(fahrenheit);
            System.out.printf("%.2f graus Fahrenheit é igual a %.2f graus Celsius.%n", fahrenheit, celsius);
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }

        scanner.close();
    }
}
