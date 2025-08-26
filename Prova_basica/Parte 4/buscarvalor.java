import java.util.Scanner;

public class buscarvalor {
    public static void main(String[] args) {
        int[] vetor = {3, 7, 1, 9, 5, 8, 2, 6, 4, 0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para buscar: ");
        int valor = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Valor não encontrado no vetor.");
        }
        scanner.close();
    }
}