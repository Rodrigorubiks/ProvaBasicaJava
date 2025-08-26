import java.util.Scanner;

public class lerimprimir {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Elementos do vetor:");
        for (int valor : vetor) {
            System.out.println(valor);
        }

        scanner.close();
    }
}