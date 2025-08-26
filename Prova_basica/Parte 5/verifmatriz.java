import java.util.Scanner;

public class verifmatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a ordem da matriz quadrada: ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean identidade = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    identidade = false;
                    break;
                }
            }
            if (!identidade) break;
        }

        if (identidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz NÃO é uma matriz identidade.");
        }
    }
}