import java.util.Scanner;

public class somadiagonal {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += matriz[i][i];
        }

        System.out.println("Soma da diagonal principal: " + soma);
        scanner.close();
    }
}