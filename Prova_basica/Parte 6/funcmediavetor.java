public class funcmediavetor {
    public static double media(double[] vetor) {
        double soma = 0;
        for (double v : vetor) soma += v;
        return soma / vetor.length;
    }

    public static void main(String[] args) {
        double[] valores = {7.1, 8.4, 3.5, 9.2};
        System.out.println("Média do vetor: " + media(valores));
    }
}