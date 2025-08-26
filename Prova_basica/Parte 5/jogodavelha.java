import java.util.Scanner;

public class jogodavelha {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        char jogador = 'X';
        int jogadas = 0;
        boolean venceu = false;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                tabuleiro[i][j] = ' ';

        while (jogadas < 9 && !venceu) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogador + ", informe linha e coluna (0, 1 ou 2):");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida! Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = jogador;
            jogadas++;

            venceu = verificarVitoria(tabuleiro, jogador);

            if (!venceu) {
                jogador = (jogador == 'X') ? 'O' : 'X';
            }
        }

        imprimirTabuleiro(tabuleiro);
        if (venceu) {
            System.out.println("Jogador " + jogador + " venceu!");
        } else {
            System.out.println("Empate!");
        }
        scanner.close();
    }

    static void imprimirTabuleiro(char[][] tab) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static boolean verificarVitoria(char[][] tab, char jogador) {

        for (int i = 0; i < 3; i++) {
            if ((tab[i][0] == jogador && tab[i][1] == jogador && tab[i][2] == jogador) ||
                (tab[0][i] == jogador && tab[1][i] == jogador && tab[2][i] == jogador)) {
                return true;
            }
        }

        if ((tab[0][0] == jogador && tab[1][1] == jogador && tab[2][2] == jogador) ||
            (tab[0][2] == jogador && tab[1][1] == jogador && tab[2][0] == jogador)) {
            return true;
        }
        return false;
    }
}        