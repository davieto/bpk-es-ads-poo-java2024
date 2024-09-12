import java.util.Scanner;
public class ex003 {
    public static void main(String[]args){
        //Cria um objeto scanner
        Scanner scanner = new Scanner(System.in);
        //tipo  //var      //instancia //chama teclado

        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        //operações
        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        // Exibe os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Fecha o Scanner
        scanner.close();


    }
}