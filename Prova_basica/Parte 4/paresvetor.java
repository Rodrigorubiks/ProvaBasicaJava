import java.util.Scanner;

public class paresvetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        int pares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
    }
}