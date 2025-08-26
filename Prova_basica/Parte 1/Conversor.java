import java.util.Scanner;

public class conversao {

    public static void main(String[] args) {
        final double TAXA_CAMBIO = 5.20; // Exemplo: 1 dólar = 5,20 reais
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em Reais (R$): ");
        double valorReais = scanner.nextDouble();

        double valorDolares = valorReais / TAXA_CAMBIO;

        System.out.printf("Valor em Dólares (US$): %.2f\n", valorDolares);

        scanner.close();
    }
}