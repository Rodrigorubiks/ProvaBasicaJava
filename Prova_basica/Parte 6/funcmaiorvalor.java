public class funcmaiorvalor {
    public static int maiorValor(int[][] matriz) {
        int maior = matriz[0][0];
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor > maior) maior = valor;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 9, 6}, {7, 8, 5}};
        System.out.println("Maior valor da matriz: " + maiorValor(matriz));
    }
}