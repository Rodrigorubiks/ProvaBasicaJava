public class funcfatorial {
    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Fatorial de " + numero + " = " + fatorial(numero));
    }
}