import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < n / 2; i++) {
            if (vetor[i] != vetor[n - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor NÃO é um palíndromo.");
        }
    }
}