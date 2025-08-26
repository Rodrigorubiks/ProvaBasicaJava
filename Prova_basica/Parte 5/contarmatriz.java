import java.util.Scanner;

public class contarmatriz {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o número a ser contado: ");
        int numero = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == numero) {
                    contador++;
                }
            }
        }

        System.out.println("O número " + numero + " aparece " + contador + " vez(es) na matriz.");
        scanner.close();    }
}