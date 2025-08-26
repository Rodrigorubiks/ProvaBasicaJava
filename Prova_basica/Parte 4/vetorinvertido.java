import java.util.Scanner;

public class vetorinvertido {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Vetor invertido:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}