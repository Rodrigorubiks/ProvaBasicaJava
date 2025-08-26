import java.util.Scanner;

public class separimpar {
    public static void main(String[] args) {
        System.out.println("Separação de números pares e ímpares em um vetor");
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0, contImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                pares[contPares++] = vetor[i];
            } else {
                impares[contImpares++] = vetor[i];
            }
        }

        System.out.print("Pares: ");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.print("Ímpares: ");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}