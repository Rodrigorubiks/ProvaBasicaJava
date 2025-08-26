import java.util.Scanner;

public class somamatriz {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] soma = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha a primeira matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Preencha a segunda matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz soma:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}