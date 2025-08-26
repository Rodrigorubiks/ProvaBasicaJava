import java.util.Scanner;

public class maiormatriz {
    public static void main(String[] args) {
       

        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int linhaMaior = -1;
        int colunaMaior = -1;

        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                // Verificando se é o maior valor
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz preenchida:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        // Exibindo o maior valor e sua posição
        System.out.println("Maior valor: " + maior + " na posição [" + linhaMaior + "][" + colunaMaior + "]");
    }
}