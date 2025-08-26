import java.util.Scanner;

public class mediavetor {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }

        double media = (double) soma / vetor.length;
        System.out.println("Média dos elementos: " + media);
        scanner.close();
    }
}