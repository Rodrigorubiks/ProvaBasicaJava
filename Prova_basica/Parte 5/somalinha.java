import java.util.Scanner;

public class somalinha {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Escolha uma linha (0 a 4) para calcular a soma: ");
        int linhaEscolhida = scanner.nextInt();

        if (linhaEscolhida < 0 || linhaEscolhida >= 5) {
            System.out.println("Linha inválida. Deve ser entre 0 e 4.");
            scanner.close();
            return;
        }

        int soma = 0;
        for (int j = 0; j < 5; j++) {
            soma += matriz[linhaEscolhida][j];
        }

        System.out.println("Soma dos elementos da linha " + linhaEscolhida + ": " + soma);
        scanner.close();

    }
}